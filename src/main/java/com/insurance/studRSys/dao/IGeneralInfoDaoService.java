package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.GeneralInfoEntity;

import java.util.Optional;

public interface IGeneralInfoDaoService {
    Optional<GeneralInfoEntity> findById(Long id);

    GeneralInfoEntity save(GeneralInfoEntity generalInfoEntity);
}
