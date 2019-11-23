package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.InsuranceTypeEntity;

import java.util.List;
import java.util.Optional;

public interface IInsuranceTypeDaoService {
    Iterable<InsuranceTypeEntity> findAll();

    InsuranceTypeEntity save(InsuranceTypeEntity insuranceTypeEntity);

    Optional<InsuranceTypeEntity> findById(Long id);

    List<InsuranceTypeEntity> findByInsuranceType(String name);
}
