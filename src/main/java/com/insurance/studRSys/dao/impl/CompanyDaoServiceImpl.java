package com.insurance.studRSys.dao.impl;


import com.insurance.studRSys.dao.ICompanyDaoService;
import com.insurance.studRSys.entity.CompanyEntity;
import com.insurance.studRSys.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class CompanyDaoServiceImpl implements ICompanyDaoService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Iterable<CompanyEntity> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public CompanyEntity save(CompanyEntity companyEntity) {
        return companyRepository.save(companyEntity);
    }

    @Override
    public Optional<CompanyEntity> findById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public List<CompanyEntity> findByName(String name) {
        return companyRepository.findByName(name);
    }
}
