package com.insurance.studRSys.modal;

import com.insurance.studRSys.entity.ExtraInfoEntity;

public class ExtraInfo {
    private String vehicle;
    private String registrationNumber;
    private String company;
    private String make;
    private String idv;
    private String tp;
    private String odPremium;
    private String tpPremium;
    private String policyDoc;

    public ExtraInfo() {
    }

    private ExtraInfo(Builder builder) {
        setVehicle(builder.vehicle);
        setRegistrationNumber(builder.registrationNumber);
        setCompany(builder.company);
        setMake(builder.make);
        setIdv(builder.idv);
        setTp(builder.tp);
        setOdPremium(builder.odPremium);
        setTpPremium(builder.tpPremium);
        setPolicyDoc(builder.policyDoc);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(ExtraInfoEntity copy) {
        Builder builder = new Builder();
        builder.vehicle = copy.getVehicle();
        builder.registrationNumber = copy.getRegistrationNumber();
        builder.company = copy.getCompany();
        builder.make = copy.getMake();
        builder.idv = copy.getIdv();
        builder.tp = copy.getTp();
        builder.odPremium = copy.getOdPremium();
        builder.tpPremium = copy.getTpPremium();
        builder.policyDoc = copy.getPolicyDoc();
        return builder;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getIdv() {
        return idv;
    }

    public void setIdv(String idv) {
        this.idv = idv;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getOdPremium() {
        return odPremium;
    }

    public void setOdPremium(String odPremium) {
        this.odPremium = odPremium;
    }

    public String getTpPremium() {
        return tpPremium;
    }

    public void setTpPremium(String tpPremium) {
        this.tpPremium = tpPremium;
    }

    public String getPolicyDoc() {
        return policyDoc;
    }

    public void setPolicyDoc(String policyDoc) {
        this.policyDoc = policyDoc;
    }


    /**
     * {@code ExtraInfo} builder static inner class.
     */
    public static final class Builder {
        private String vehicle;
        private String registrationNumber;
        private String company;
        private String make;
        private String idv;
        private String tp;
        private String odPremium;
        private String tpPremium;
        private String policyDoc;

        private Builder() {
        }

        /**
         * Sets the {@code vehicle} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code vehicle} to set
         * @return a reference to this Builder
         */
        public Builder setVehicle(String val) {
            vehicle = val;
            return this;
        }

        /**
         * Sets the {@code registrationNumber} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code registrationNumber} to set
         * @return a reference to this Builder
         */
        public Builder setRegistrationNumber(String val) {
            registrationNumber = val;
            return this;
        }

        /**
         * Sets the {@code company} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code company} to set
         * @return a reference to this Builder
         */
        public Builder setCompany(String val) {
            company = val;
            return this;
        }

        /**
         * Sets the {@code make} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code make} to set
         * @return a reference to this Builder
         */
        public Builder setMake(String val) {
            make = val;
            return this;
        }

        /**
         * Sets the {@code idv} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code idv} to set
         * @return a reference to this Builder
         */
        public Builder setIdv(String val) {
            idv = val;
            return this;
        }

        /**
         * Sets the {@code tp} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code tp} to set
         * @return a reference to this Builder
         */
        public Builder setTp(String val) {
            tp = val;
            return this;
        }

        /**
         * Sets the {@code odPremium} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code odPremium} to set
         * @return a reference to this Builder
         */
        public Builder setOdPremium(String val) {
            odPremium = val;
            return this;
        }

        /**
         * Sets the {@code tpPremium} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code tpPremium} to set
         * @return a reference to this Builder
         */
        public Builder setTpPremium(String val) {
            tpPremium = val;
            return this;
        }

        /**
         * Sets the {@code policyDoc} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code policyDoc} to set
         * @return a reference to this Builder
         */
        public Builder setPolicyDoc(String val) {
            policyDoc = val;
            return this;
        }

        /**
         * Returns a {@code ExtraInfo} built from the parameters previously set.
         *
         * @return a {@code ExtraInfo} built with parameters of this {@code ExtraInfo.Builder}
         */
        public ExtraInfo build() {
            return new ExtraInfo(this);
        }
    }
}
