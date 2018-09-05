package com.xinda.counterfeit.pojo;

public class TbOperatelog {
    private Long operatelogId;

    private Long operatelogCreatedate;

    private String operatelogIpaddr;

    private String operatelogLogtype;

    private String operatelogResult;

    private String operatelogUsername;

    private String operatelogLogmessage;

    public Long getOperatelogId() {
        return operatelogId;
    }

    public void setOperatelogId(Long operatelogId) {
        this.operatelogId = operatelogId;
    }

    public Long getOperatelogCreatedate() {
        return operatelogCreatedate;
    }

    public void setOperatelogCreatedate(Long operatelogCreatedate) {
        this.operatelogCreatedate = operatelogCreatedate;
    }

    public String getOperatelogIpaddr() {
        return operatelogIpaddr;
    }

    public void setOperatelogIpaddr(String operatelogIpaddr) {
        this.operatelogIpaddr = operatelogIpaddr == null ? null : operatelogIpaddr.trim();
    }

    public String getOperatelogLogtype() {
        return operatelogLogtype;
    }

    public void setOperatelogLogtype(String operatelogLogtype) {
        this.operatelogLogtype = operatelogLogtype == null ? null : operatelogLogtype.trim();
    }

    public String getOperatelogResult() {
        return operatelogResult;
    }

    public void setOperatelogResult(String operatelogResult) {
        this.operatelogResult = operatelogResult == null ? null : operatelogResult.trim();
    }

    public String getOperatelogUsername() {
        return operatelogUsername;
    }

    public void setOperatelogUsername(String operatelogUsername) {
        this.operatelogUsername = operatelogUsername == null ? null : operatelogUsername.trim();
    }

    public String getOperatelogLogmessage() {
        return operatelogLogmessage;
    }

    public void setOperatelogLogmessage(String operatelogLogmessage) {
        this.operatelogLogmessage = operatelogLogmessage == null ? null : operatelogLogmessage.trim();
    }
}