package com.insurance.studRSys.dao.impl;

import com.insurance.studRSys.dao.IAdminDaoService;
import com.insurance.studRSys.entity.AdminsEntity;
import com.insurance.studRSys.repo.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class AdminDaoServiceImpl implements IAdminDaoService {
    @Autowired
    private AdminsRepository adminsRepository;

    @Override
    public AdminsEntity save(AdminsEntity adminsEntity) {
        return adminsRepository.save(adminsEntity);
    }

    @Override
    public List<AdminsEntity> findByAdminId(Long adminId) {
        return adminsRepository.findByAdminId(adminId);
    }


}
