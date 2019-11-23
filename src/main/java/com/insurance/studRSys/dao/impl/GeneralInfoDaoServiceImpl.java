package com.insurance.studRSys.dao.impl;


import com.insurance.studRSys.dao.IGeneralInfoDaoService;
import com.insurance.studRSys.entity.GeneralInfoEntity;
import com.insurance.studRSys.repo.GeneralInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class GeneralInfoDaoServiceImpl implements IGeneralInfoDaoService {

    @Autowired
    private GeneralInfoRepository generalInfoRepository;

    @Override
    public Optional<GeneralInfoEntity> findById(Long id) {
        return generalInfoRepository.findById(id);
    }

    @Override
    public GeneralInfoEntity save(GeneralInfoEntity generalInfoEntity) {
        return generalInfoRepository.save(generalInfoEntity);
    }
}
