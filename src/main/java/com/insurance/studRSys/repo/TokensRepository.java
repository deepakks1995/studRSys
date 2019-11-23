package com.insurance.studRSys.repo;

import com.insurance.studRSys.entity.TokenEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TokensRepository extends CrudRepository<TokenEntity, Long> {
    List<TokenEntity> findByAdminIdAndToken(String admiId, String token);
}
