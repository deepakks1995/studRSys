package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.CompanyEntity;

import java.util.List;
import java.util.Optional;

public interface ICompanyDaoService {
    Iterable<CompanyEntity> findAll();

    CompanyEntity save(CompanyEntity companyEntity);

    Optional<CompanyEntity> findById(Long id);

    List<CompanyEntity> findByName(String name);
}
