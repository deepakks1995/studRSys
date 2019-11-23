package com.insurance.studRSys.modal;

import java.util.List;

public class MasterData {
    List<String> insuranceTypeEntityList;

    List<String> companyEntityList;

    public MasterData(List<String> insuranceTypeEntityList, List<String> companyEntityList) {
        this.insuranceTypeEntityList = insuranceTypeEntityList;
        this.companyEntityList = companyEntityList;
    }

    public List<String> getInsuranceTypeEntityList() {
        return insuranceTypeEntityList;
    }

    public void setInsuranceTypeEntityList(List<String> insuranceTypeEntityList) {
        this.insuranceTypeEntityList = insuranceTypeEntityList;
    }

    public List<String> getCompanyEntityList() {
        return companyEntityList;
    }

    public void setCompanyEntityList(List<String> companyEntityList) {
        this.companyEntityList = companyEntityList;
    }
}
