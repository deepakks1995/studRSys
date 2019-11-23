package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.TokenEntity;

import java.util.List;

public interface ITokenDaoService {
    List<TokenEntity> findByAdminIdAndToken(String admiId, String token);
}
