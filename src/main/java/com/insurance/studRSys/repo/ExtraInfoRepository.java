package com.insurance.studRSys.repo;

import com.insurance.studRSys.entity.ExtraInfoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExtraInfoRepository extends CrudRepository<ExtraInfoEntity, Long> {

    List<ExtraInfoEntity> findByGeneralInfoId(Long id);

}
