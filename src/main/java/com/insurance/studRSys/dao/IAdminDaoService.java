package com.insurance.studRSys.dao;

import com.insurance.studRSys.entity.AdminsEntity;

import java.util.List;

public interface IAdminDaoService {
    AdminsEntity save(AdminsEntity adminsEntity);

    List<AdminsEntity> findByAdminId(Long adminId);
}
