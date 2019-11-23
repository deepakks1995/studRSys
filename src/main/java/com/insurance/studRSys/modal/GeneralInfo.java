package com.insurance.studRSys.modal;

import com.insurance.studRSys.entity.GeneralInfoEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class GeneralInfo {

    private String insuranceType;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Date dob;
    private String pointOfAssociation;
    private String policyNumber;
    private Date policyValidity;
    private String company;

    public GeneralInfo() {

    }

    private GeneralInfo(Builder builder) {
        setInsuranceType(builder.insuranceType);
        setName(builder.name);
        setAddress(builder.address);
        setMobile(builder.mobile);
        setEmail(builder.email);
        setDob(builder.dob);
        setPointOfAssociation(builder.pointOfAssociation);
        setPolicyNumber(builder.policyNumber);
        setPolicyValidity(builder.policyValidity);
        setCompany(builder.company);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(GeneralInfoEntity copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.address = copy.getAddress();
        builder.mobile = copy.getMobile();
        builder.email = copy.getEmail();
        builder.dob = copy.getDob();
        builder.pointOfAssociation = copy.getPointOfAssociation();
        builder.policyNumber = copy.getPolicyNumber();
        builder.policyValidity = copy.getPolicyValidity();
        return builder;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPointOfAssociation() {
        return pointOfAssociation;
    }

    public void setPointOfAssociation(String pointOfAssociation) {
        this.pointOfAssociation = pointOfAssociation;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Date getPolicyValidity() {
        return policyValidity;
    }

    public void setPolicyValidity(Date policyValidity) {
        this.policyValidity = policyValidity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * {@code GeneralInfo} builder static inner class.
     */
    public static final class Builder {
        private String insuranceType;
        private String name;
        private String address;
        private String mobile;
        private String email;
        private Date dob;
        private String pointOfAssociation;
        private String policyNumber;
        private Date policyValidity;
        private String company;

        private Builder() {
        }

        /**
         * Sets the {@code insuranceType} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code insuranceType} to set
         * @return a reference to this Builder
         */
        public Builder setInsuranceType(String val) {
            insuranceType = val;
            return this;
        }

        /**
         * Sets the {@code name} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code name} to set
         * @return a reference to this Builder
         */
        public Builder setName(String val) {
            name = val;
            return this;
        }

        /**
         * Sets the {@code address} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code address} to set
         * @return a reference to this Builder
         */
        public Builder setAddress(String val) {
            address = val;
            return this;
        }

        /**
         * Sets the {@code mobile} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code mobile} to set
         * @return a reference to this Builder
         */
        public Builder setMobile(String val) {
            mobile = val;
            return this;
        }

        /**
         * Sets the {@code email} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code email} to set
         * @return a reference to this Builder
         */
        public Builder setEmail(String val) {
            email = val;
            return this;
        }

        /**
         * Sets the {@code dob} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code dob} to set
         * @return a reference to this Builder
         */
        public Builder setDob(Date val) {
            dob = val;
            return this;
        }

        /**
         * Sets the {@code pointOfAssociation} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code pointOfAssociation} to set
         * @return a reference to this Builder
         */
        public Builder setPointOfAssociation(String val) {
            pointOfAssociation = val;
            return this;
        }

        /**
         * Sets the {@code policyNumber} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code policyNumber} to set
         * @return a reference to this Builder
         */
        public Builder setPolicyNumber(String val) {
            policyNumber = val;
            return this;
        }

        /**
         * Sets the {@code policyValidity} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code policyValidity} to set
         * @return a reference to this Builder
         */
        public Builder setPolicyValidity(Date val) {
            policyValidity = val;
            return this;
        }

        public Builder setCompany(String val) {
            company = val;
            return this;
        }

        /**
         * Returns a {@code GeneralInfo} built from the parameters previously set.
         *
         * @return a {@code GeneralInfo} built with parameters of this {@code GeneralInfo.Builder}
         */
        public GeneralInfo build() {
            return new GeneralInfo(this);
        }
    }
}
