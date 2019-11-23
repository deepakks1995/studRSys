package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.ExtraInfoEntity;

import java.util.List;
import java.util.Optional;

public interface IExtraInfoDaoService {
    Optional<ExtraInfoEntity> findById(Long id);

    ExtraInfoEntity save(ExtraInfoEntity extraInfoEntity);

    List<ExtraInfoEntity> findByGeneralInfoId(Long id);
}
