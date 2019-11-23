package com.insurance.studRSys.repo;

import com.insurance.studRSys.entity.StudentsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentsRepository extends CrudRepository<StudentsEntity, Long> {
    List<StudentsEntity> findByStudId(Long studId);

    List<StudentsEntity> findByNameLike(String studId);

    void deleteByStudIdIn(List<Long> ids);

    List<StudentsEntity> findByStudIdIn(List<Long> studId);
}
