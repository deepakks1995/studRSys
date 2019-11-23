package com.insurance.studRSys.controllers;

import com.insurance.studRSys.dao.ICompanyDaoService;
import com.insurance.studRSys.dao.IExtraInfoDaoService;
import com.insurance.studRSys.dao.IGeneralInfoDaoService;
import com.insurance.studRSys.dao.IInsuranceTypeDaoService;
import com.insurance.studRSys.entity.CompanyEntity;
import com.insurance.studRSys.entity.ExtraInfoEntity;
import com.insurance.studRSys.entity.GeneralInfoEntity;
import com.insurance.studRSys.entity.InsuranceTypeEntity;
import com.insurance.studRSys.enums.Status;
import com.insurance.studRSys.modal.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/v1")
public class initController {
    @Autowired
    private ICompanyDaoService companyDaoService;

    @Autowired
    private IInsuranceTypeDaoService insuranceTypeDaoService;

    @Autowired
    private IGeneralInfoDaoService generalInfoDaoService;

    @Autowired
    private IExtraInfoDaoService extraInfoDaoService;

    @CrossOrigin("*")
    @GetMapping("/getMasterData")
    public ResponseDetailed<MasterData> getMasterData() {
        List<String> insuranceTypeEntityList = StreamSupport.stream(
                insuranceTypeDaoService.findAll().spliterator(), false
        ).map(InsuranceTypeEntity::getInsuranceType).collect(Collectors.toList());

        List<String> companyEntityList = StreamSupport.stream(
                companyDaoService.findAll().spliterator(), false
        ).map(CompanyEntity::getName).collect(Collectors.toList());

        return new ResponseDetailed<>(
                "Successfully fetched data",
                Status.SUCCESS,
                new MasterData(insuranceTypeEntityList, companyEntityList)
        );
    }

    @GetMapping("/getClientInfo/{id}")
    public ResponseDetailed<ClientInfo> getClientInfo(@PathVariable Long id) {
        Optional<GeneralInfoEntity> generalInfoEntity = generalInfoDaoService.findById(id);

        if (!generalInfoEntity.isPresent())
            return new ResponseDetailed<>("General Entry doesn't exist", Status.FAILED, null);

        List<ExtraInfoEntity> extraInfoEntities = extraInfoDaoService.findByGeneralInfoId(generalInfoEntity.get().getId());

        if (extraInfoEntities.size() == 0)
            return new ResponseDetailed<>("Extra Entry doesn't exist", Status.FAILED, null);

        GeneralInfo.Builder generalInfoBuilder = GeneralInfo.newBuilder(generalInfoEntity.get());

        Optional<InsuranceTypeEntity> insuranceTypeEntity = insuranceTypeDaoService.findById(generalInfoEntity.get().getProductId());

        if (!insuranceTypeEntity.isPresent())
            return new ResponseDetailed<>("Product Entry doesn't exist", Status.FAILED, null);

        generalInfoBuilder.setInsuranceType(insuranceTypeEntity.get().getInsuranceType());

        Optional<CompanyEntity> companyEntity = companyDaoService.findById(generalInfoEntity.get().getCompanyId());

        if (!companyEntity.isPresent())
            return new ResponseDetailed<>("Product Entry doesn't exist", Status.FAILED, null);

        generalInfoBuilder.setCompany(companyEntity.get().getName());

        return new ResponseDetailed<>(
                "Successfully fetched data",
                Status.SUCCESS,
                new ClientInfo(
                        generalInfoBuilder.build(),
                        ExtraInfo.newBuilder(extraInfoEntities.get(0)).build()
                )
        );
    }

    @CrossOrigin("*")
    @PostMapping("/saveClientInfo")
    public Response saveClientInfo(@RequestBody ClientInfo request) {
        try {
            GeneralInfoEntity.Builder generalInfoBuilder = GeneralInfoEntity.newBuilder(request.getGeneralInfo());

            List<CompanyEntity> companyEntities = companyDaoService.findByName(request.getGeneralInfo().getCompany());

            if (companyEntities.size() == 0)
                return new Response("Company Entry doesn't exist", Status.FAILED);

            List<InsuranceTypeEntity> insuranceTypeEntities = insuranceTypeDaoService.findByInsuranceType(request.getGeneralInfo().getInsuranceType());

            if (insuranceTypeEntities.size() == 0)
                return new Response("Product Entry doesn't exist", Status.FAILED);

            generalInfoBuilder.setCompanyId(companyEntities.get(0).getId());

            generalInfoBuilder.setProductId(insuranceTypeEntities.get(0).getId());

            GeneralInfoEntity duplicateEntry = generalInfoDaoService.save(generalInfoBuilder.build());

//            ExtraInfoEntity.Builder extraInfoBuilder = ExtraInfoEntity.newBuilder(request.getExtraInfo());
//
//            extraInfoBuilder.setGeneralInfoId(duplicateEntry.getId());
//
//            extraInfoDaoService.save(extraInfoBuilder.build());

            return new Response("Successfully Saved entries", Status.SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Response("Something went wrong", Status.FAILED);
    }
}
