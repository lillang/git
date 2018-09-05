package com.xinda.counterfeit.pojo;

public class TbRight {
    private Long rightId;

    private Long rightParentid;

    private String rightName;

    private Integer rightSort;

    private Long rightMenuid;

    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }

    public Long getRightParentid() {
        return rightParentid;
    }

    public void setRightParentid(Long rightParentid) {
        this.rightParentid = rightParentid;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    public Integer getRightSort() {
        return rightSort;
    }

    public void setRightSort(Integer rightSort) {
        this.rightSort = rightSort;
    }

    public Long getRightMenuid() {
        return rightMenuid;
    }

    public void setRightMenuid(Long rightMenuid) {
        this.rightMenuid = rightMenuid;
    }
}