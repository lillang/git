package com.xinda.counterfeit.pojo;

public class TbCounterfeit {
    private Long counterfeitId;

    private String counterfeitSerialnum;

    private Long counterfeitCreatedate;

    private Long counterfeitDeviceid;

    private String counterfeitCurrency;

    private String counterfeitBottle;

    private Integer counterfeitMoney;

    private String counterfeitCheckresult;

    private String counterfeitPicture;

    private String counterfeitCapturename;

    private String counterfeitCaptureaddress;

    private Integer counterfeitType;

    private Long counterfeitCapturedate;

    private Integer counterfeitRecycle;
    private String counterfeitPicName;
    private String counterfeitResName;
    private TbDevice tbDevice;

    public Long getCounterfeitId() {
        return counterfeitId;
    }

    public void setCounterfeitId(Long counterfeitId) {
        this.counterfeitId = counterfeitId;
    }

    public String getCounterfeitSerialnum() {
        return counterfeitSerialnum;
    }

    public void setCounterfeitSerialnum(String counterfeitSerialnum) {
        this.counterfeitSerialnum = counterfeitSerialnum == null ? null : counterfeitSerialnum.trim();
    }

    public Long getCounterfeitCreatedate() {
        return counterfeitCreatedate;
    }

    public void setCounterfeitCreatedate(Long counterfeitCreatedate) {
        this.counterfeitCreatedate = counterfeitCreatedate;
    }
    

    public String getCounterfeitPicName() {
		return counterfeitPicName;
	}

	public void setCounterfeitPicName(String counterfeitPicName) {
		this.counterfeitPicName = counterfeitPicName;
	}

	public String getCounterfeitResName() {
		return counterfeitResName;
	}

	public void setCounterfeitResName(String counterfeitResName) {
		this.counterfeitResName = counterfeitResName;
	}

	public Long getCounterfeitDeviceid() {
        return counterfeitDeviceid;
    }

    public void setCounterfeitDeviceid(Long counterfeitDeviceid) {
        this.counterfeitDeviceid = counterfeitDeviceid;
    }

    public String getCounterfeitCurrency() {
        return counterfeitCurrency;
    }

    public void setCounterfeitCurrency(String counterfeitCurrency) {
        this.counterfeitCurrency = counterfeitCurrency == null ? null : counterfeitCurrency.trim();
    }

    public String getCounterfeitBottle() {
        return counterfeitBottle;
    }

    public void setCounterfeitBottle(String counterfeitBottle) {
        this.counterfeitBottle = counterfeitBottle == null ? null : counterfeitBottle.trim();
    }

    public Integer getCounterfeitMoney() {
        return counterfeitMoney;
    }

    public void setCounterfeitMoney(Integer counterfeitMoney) {
        this.counterfeitMoney = counterfeitMoney;
    }

    public String getCounterfeitCheckresult() {
        return counterfeitCheckresult;
    }

    public void setCounterfeitCheckresult(String counterfeitCheckresult) {
        this.counterfeitCheckresult = counterfeitCheckresult == null ? null : counterfeitCheckresult.trim();
    }

    public String getCounterfeitPicture() {
        return counterfeitPicture;
    }

    public void setCounterfeitPicture(String counterfeitPicture) {
        this.counterfeitPicture = counterfeitPicture == null ? null : counterfeitPicture.trim();
    }

    public String getCounterfeitCapturename() {
        return counterfeitCapturename;
    }

    public void setCounterfeitCapturename(String counterfeitCapturename) {
        this.counterfeitCapturename = counterfeitCapturename == null ? null : counterfeitCapturename.trim();
    }

    public String getCounterfeitCaptureaddress() {
        return counterfeitCaptureaddress;
    }

    public void setCounterfeitCaptureaddress(String counterfeitCaptureaddress) {
        this.counterfeitCaptureaddress = counterfeitCaptureaddress == null ? null : counterfeitCaptureaddress.trim();
    }

    public Integer getCounterfeitType() {
        return counterfeitType;
    }

    public void setCounterfeitType(Integer counterfeitType) {
        this.counterfeitType = counterfeitType;
    }

    public Long getCounterfeitCapturedate() {
        return counterfeitCapturedate;
    }

    public void setCounterfeitCapturedate(Long counterfeitCapturedate) {
        this.counterfeitCapturedate = counterfeitCapturedate;
    }

    public Integer getCounterfeitRecycle() {
        return counterfeitRecycle;
    }

    public void setCounterfeitRecycle(Integer counterfeitRecycle) {
        this.counterfeitRecycle = counterfeitRecycle;
    }

	public TbDevice getTbDevice() {
		return tbDevice;
	}

	public void setTbDevice(TbDevice tbDevice) {
		this.tbDevice = tbDevice;
	}

}