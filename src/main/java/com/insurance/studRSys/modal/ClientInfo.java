package com.insurance.studRSys.modal;

public class ClientInfo {
    GeneralInfo generalInfo;

    ExtraInfo extraInfo;

    public ClientInfo(GeneralInfo generalInfo, ExtraInfo extraInfo) {
        this.generalInfo = generalInfo;
        this.extraInfo = extraInfo;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }
}