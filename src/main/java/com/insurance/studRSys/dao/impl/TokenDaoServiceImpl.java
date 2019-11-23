package com.insurance.studRSys.dao.impl;

import com.insurance.studRSys.dao.ITokenDaoService;
import com.insurance.studRSys.entity.TokenEntity;
import com.insurance.studRSys.repo.TokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class TokenDaoServiceImpl implements ITokenDaoService {

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<TokenEntity> findByAdminIdAndToken(String admiId, String token) {
        return tokensRepository.findByAdminIdAndToken(admiId, token);
    }
}
