package com.insurance.studRSys.repo;


import com.insurance.studRSys.entity.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository<CompanyEntity, Long> {
    List<CompanyEntity> findByName(String name);
}
