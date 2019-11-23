package com.insurance.studRSys.controllers;

import com.insurance.studRSys.dao.IStudentsDaoService;
import com.insurance.studRSys.entity.StudentsEntity;
import com.insurance.studRSys.enums.Status;
import com.insurance.studRSys.modal.Request;
import com.insurance.studRSys.modal.Response;
import com.insurance.studRSys.modal.ResponseDetailed;
import com.insurance.studRSys.utils.RequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private IStudentsDaoService studentsDaoService;

    @Autowired
    private RequestValidator<StudentsEntity> requestValidator;

    /**
     * Api to getDetails of a specific student based on student id
     * @param studentId
     * @return {@link StudentsEntity} object containing details
     */
    @GetMapping("/getStudentDetails/{studentId}")
    public List<StudentsEntity> getStudentDetails(@PathVariable Long studentId) {
        return studentsDaoService.findByStudId(studentId);
    }

    /**
     * Api to add list of multiple students or a single student
     * @param request
     * @return
     */
    @PostMapping("/addNewStudents")
    public ResponseDetailed<List<StudentsEntity>> addNewStudents(@RequestBody Request<List<StudentsEntity>> request) {
        List<StudentsEntity> existingEntities;
        List<StudentsEntity> validEntries;

        // Verifying if token passed is valid
//        if (!tokenController.validateToken(request.getToken(), request.getAdminId()))
//            return new ResponseDetailed<>("Invalid/Expired Token Passed", Status.FAILED, request.getData());

        List<StudentsEntity> studentsEntities = request.getData();

        // Verifying if all the mandatory fields are passed
        boolean isInvalidStructurePassed = studentsEntities.stream().anyMatch(entity -> !requestValidator.validate(entity));
        if (isInvalidStructurePassed) return new ResponseDetailed<>("Invalid Api Format, Failed for following", Status.FAILED, studentsEntities);

        // Collecting all existing entries in the database
        List<Long> ids = studentsEntities.stream()
                .map(StudentsEntity::getStudId)
                .collect(Collectors.toList());
        existingEntities = studentsDaoService.findByStudIdIn(ids);

        validEntries = studentsEntities.stream()
                .filter(studentsEntity ->
                        existingEntities.stream()
                                .noneMatch(existingEntity -> existingEntity.equals(studentsEntity))
                )
                .collect(Collectors.toList());

        studentsDaoService.saveAll(validEntries);

        if (existingEntities.size() == 0)
            return new ResponseDetailed<>("Student Entry created successfully", Status.SUCCESS, null);
        return new ResponseDetailed<>("Students Entry failed for some cases", Status.FAILED, existingEntities);
    }

    /**
     * Api to update student records
     * @param request
     * @return
     */
    @PostMapping("/updateStudentRecords")
    public ResponseDetailed<List<StudentsEntity>> modifyStudents(@RequestBody Request<List<StudentsEntity>> request) {
        List<StudentsEntity> invalidEntries;
        List<StudentsEntity> existingEntities;

//        // Verifying if token passed is valid
//        if (!tokenController.validateToken(request.getToken(), request.getAdminId()))
//            return new ResponseDetailed<>("Invalid/Expired Token Passed", Status.FAILED, request.getData());

        List<StudentsEntity> studentsEntities = request.getData();

        // Verifying if all the mandatory fields are passed
        boolean isInvalidStructurePassed = studentsEntities.stream().anyMatch(entity -> !requestValidator.validate(entity));
        if (isInvalidStructurePassed) return new ResponseDetailed<>("Invalid Api Format, Failed for following", Status.FAILED, studentsEntities);

        // Collecting all existing entries in the database
        List<Long> ids = studentsEntities.stream()
                .map(StudentsEntity::getStudId)
                .collect(Collectors.toList());

        existingEntities = studentsDaoService.findByStudIdIn(ids);

        // Collecting all common entries which are in database as well as passed in request and to be updated
        List<StudentsEntity> updatableEntries = studentsEntities.stream()
                .filter(existingEntities::contains)
                .collect(Collectors.toList());

        // Modifying all pre existing entities in database
        studentsDaoService.saveAll(updatableEntries);

        // Filtering all entries which do not exist in database, hence informing the user to check details properly
        invalidEntries = studentsEntities.stream()
                .filter(studentsEntity ->
                        existingEntities.stream()
                                .noneMatch(existingEntity -> existingEntity.equals(studentsEntity))
                )
                .collect(Collectors.toList());

        if (invalidEntries.size() > 0)
            return new ResponseDetailed<>("Following Updates were rejected", Status.FAILED, invalidEntries);
        return new ResponseDetailed<>("All Entries were updated Successfully", Status.SUCCESS, null);
    }

    @PostMapping("/deleteStudentsRecord")
    @Transactional
    public Response deleteStudentsRecord(@RequestBody Request<List<Long> > request) {
        // Verifying if token passed is valid
//        if (!tokenController.validateToken(request.getToken(), request.getAdminId()))
//            return new Response("Invalid/Expired Token Passed", Status.FAILED);

        studentsDaoService.deleteByStudIdIn(request.getData());
        return new Response("All Corresponding Entries were deleted Successfully", Status.SUCCESS);
    }

    @GetMapping("/searchStudentDetails")
    public List<StudentsEntity> searchStudentDetails(@RequestParam("studName") String studName) {
        return studentsDaoService.findByNameLike(studName+ "%");
    }
}
