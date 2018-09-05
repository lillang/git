package com.xinda.counterfeit.pojo;

public class TbUser {
    private Long userId;

    private String userAccount;

    private String userPassword;

    private Integer userRoleid;

    private String userName;

    private Integer userSex;

    private String userPhone;

    private String userWechat;

    private String userQq;

    private Integer userRetrylogin;

    private Integer userStatus;
    
    private TbRole tbRole;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserRoleid() {
        return userRoleid;
    }

    public void setUserRoleid(Integer userRoleid) {
        this.userRoleid = userRoleid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat == null ? null : userWechat.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public Integer getUserRetrylogin() {
        return userRetrylogin;
    }

    public void setUserRetrylogin(Integer userRetrylogin) {
        this.userRetrylogin = userRetrylogin;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

	public TbRole getTbRole() {
		return tbRole;
	}

	public void setTbRole(TbRole tbRole) {
		this.tbRole = tbRole;
	}
    
}