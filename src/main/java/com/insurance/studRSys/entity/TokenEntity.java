package com.insurance.studRSys.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tokens")
public class TokenEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String adminId;
    private String token;
    private Date expiryAt;
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiryAt() {
        return expiryAt;
    }

    public void setExpiryAt(Date expiryAt) {
        this.expiryAt = expiryAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
