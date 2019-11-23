package com.insurance.studRSys.dao.impl;


import com.insurance.studRSys.dao.IExtraInfoDaoService;
import com.insurance.studRSys.entity.ExtraInfoEntity;
import com.insurance.studRSys.repo.ExtraInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class ExtraInfoDaoServiceImpl implements IExtraInfoDaoService {

    @Autowired
    private ExtraInfoRepository extraInfoRepository;

    @Override
    public Optional<ExtraInfoEntity> findById(Long id) {
        return extraInfoRepository.findById(id);
    }

    @Override
    public ExtraInfoEntity save(ExtraInfoEntity extraInfoEntity) {
        return extraInfoRepository.save(extraInfoEntity);
    }

    @Override
    public List<ExtraInfoEntity> findByGeneralInfoId(Long id) {
        return extraInfoRepository.findByGeneralInfoId(id);
    }
}
