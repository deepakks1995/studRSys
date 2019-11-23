package com.insurance.studRSys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="students")
public class StudentsEntity {
    @Id
    private Long studId;
    private String name;
    private String fName;
    private String mName;
    private String address;

    public Long getStudId() {
        return studId;
    }

    public void setStudId(Long studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsEntity entity = (StudentsEntity) o;
        return Objects.equals(studId, entity.studId);
    }

    @Override
    public String toString() {
        return "StudentsEntity{" +

                ", studId=" + studId +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
