package com.xinda.counterfeit.pojo;

public class TbDevice {
    private Long deviceId;

    private String deviceAccount;

    private String deviceBank;

    private String deviceAddress;

    private String deviceDetailed;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceAccount() {
        return deviceAccount;
    }

    public void setDeviceAccount(String deviceAccount) {
        this.deviceAccount = deviceAccount == null ? null : deviceAccount.trim();
    }

    public String getDeviceBank() {
        return deviceBank;
    }

    public void setDeviceBank(String deviceBank) {
        this.deviceBank = deviceBank == null ? null : deviceBank.trim();
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress == null ? null : deviceAddress.trim();
    }

    public String getDeviceDetailed() {
        return deviceDetailed;
    }

    public void setDeviceDetailed(String deviceDetailed) {
        this.deviceDetailed = deviceDetailed == null ? null : deviceDetailed.trim();
    }
}