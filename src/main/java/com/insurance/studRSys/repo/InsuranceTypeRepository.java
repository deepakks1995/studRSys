package com.insurance.studRSys.repo;


import com.insurance.studRSys.entity.InsuranceTypeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InsuranceTypeRepository extends CrudRepository<InsuranceTypeEntity, Long> {
    List<InsuranceTypeEntity> findByInsuranceType(String name);
}
