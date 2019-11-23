package com.insurance.studRSys.repo;

import com.insurance.studRSys.entity.AdminsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminsRepository extends CrudRepository<AdminsEntity, Long> {
    List<AdminsEntity> findByAdminId(Long adminId);
}
