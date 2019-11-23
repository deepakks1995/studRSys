package com.insurance.studRSys.entity;

import com.insurance.studRSys.modal.GeneralInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="general_info")
public class GeneralInfoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Date dob;
    private String pointOfAssociation;
    private String policyNumber;
    private Date policyValidity;
    private Long companyId;

    public GeneralInfoEntity() {

    }

    private GeneralInfoEntity(Builder builder) {
//        setId(builder.id);
        setProductId(builder.productId);
        setName(builder.name);
        setAddress(builder.address);
        setMobile(builder.mobile);
        setEmail(builder.email);
        setDob(builder.dob);
        setPointOfAssociation(builder.pointOfAssociation);
        setPolicyNumber(builder.policyNumber);
        setPolicyValidity(builder.policyValidity);
        setCompanyId(builder.companyId);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(GeneralInfo copy) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }


    /**
     * {@code GeneralInfoEntity} builder static inner class.
     */
    public static final class Builder {
        private Long id;
        private Long productId;
        private String name;
        private String address;
        private String mobile;
        private String email;
        private Date dob;
        private String pointOfAssociation;
        private String policyNumber;
        private Date policyValidity;
        private Long companyId;

        private Builder() {
        }

        /**
         * Sets the {@code id} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code id} to set
         * @return a reference to this Builder
         */
        public Builder setId(Long val) {
            id = val;
            return this;
        }

        /**
         * Sets the {@code productId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code productId} to set
         * @return a reference to this Builder
         */
        public Builder setProductId(Long val) {
            productId = val;
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

        /**
         * Sets the {@code companyId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code companyId} to set
         * @return a reference to this Builder
         */
        public Builder setCompanyId(Long val) {
            companyId = val;
            return this;
        }



        /**
         * Returns a {@code GeneralInfoEntity} built from the parameters previously set.
         *
         * @return a {@code GeneralInfoEntity} built with parameters of this {@code GeneralInfoEntity.Builder}
         */
        public GeneralInfoEntity build() {
            return new GeneralInfoEntity(this);
        }
    }
}
