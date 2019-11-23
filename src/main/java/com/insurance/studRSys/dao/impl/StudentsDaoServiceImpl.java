package com.insurance.studRSys.dao.impl;

import com.insurance.studRSys.dao.IStudentsDaoService;
import com.insurance.studRSys.entity.StudentsEntity;
import com.insurance.studRSys.repo.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class StudentsDaoServiceImpl implements IStudentsDaoService {

    @Autowired
    StudentsRepository studentsRepository;

    @Override
    public StudentsEntity save(StudentsEntity entity) {
        return studentsRepository.save(entity);
    }

    @Override
    public List<StudentsEntity> findByStudId(Long studId) {
        return studentsRepository.findByStudId(studId);
    }

    @Override
    public List<StudentsEntity> findByStudIdIn(List<Long> studId) {
        return studentsRepository.findByStudIdIn(studId);
    }

    @Override
    public List<StudentsEntity> findByNameLike(String studId) {
        return studentsRepository.findByNameLike(studId);
    }

    @Override
    public Iterable<StudentsEntity> saveAll(List<StudentsEntity> entities) {
        return studentsRepository.saveAll(entities);
    }

    @Override
    public void deleteByStudIdIn(List<Long> ids) {
        studentsRepository.deleteByStudIdIn(ids);
    }
}
