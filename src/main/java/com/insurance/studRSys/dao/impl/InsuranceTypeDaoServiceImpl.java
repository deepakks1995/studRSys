package com.insurance.studRSys.dao.impl;


import com.insurance.studRSys.dao.IInsuranceTypeDaoService;
import com.insurance.studRSys.entity.InsuranceTypeEntity;
import com.insurance.studRSys.repo.InsuranceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class InsuranceTypeDaoServiceImpl implements IInsuranceTypeDaoService {

    @Autowired
    private InsuranceTypeRepository insuranceTypeRepository;

    @Override
    public Iterable<InsuranceTypeEntity> findAll() {
        return insuranceTypeRepository.findAll();
    }

    @Override
    public InsuranceTypeEntity save(InsuranceTypeEntity insuranceTypeEntity) {
        return insuranceTypeRepository.save(insuranceTypeEntity);
    }

    @Override
    public Optional<InsuranceTypeEntity> findById(Long id) {
        return insuranceTypeRepository.findById(id);
    }

    @Override
    public List<InsuranceTypeEntity> findByInsuranceType(String name) {
        return insuranceTypeRepository.findByInsuranceType(name);
    }
}