package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.StudentsEntity;

import java.util.List;

public interface IStudentsDaoService {
    StudentsEntity save(StudentsEntity entity);

    List<StudentsEntity> findByStudId(Long studId);
    List<StudentsEntity> findByStudIdIn(List<Long> studId);
    List<StudentsEntity> findByNameLike(String studId);
    Iterable<StudentsEntity> saveAll(List<StudentsEntity> entities);

    void deleteByStudIdIn(List<Long> ids);
}
