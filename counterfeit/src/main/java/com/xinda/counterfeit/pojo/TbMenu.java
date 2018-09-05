package com.xinda.counterfeit.pojo;

public class TbMenu {
    private Long menuId;

    private Long menuParentid;

    private String menuText;

    private String menuUrl;

    private String menuIconcls;

    private Integer menuStatus;

    private Integer menuIchecked;

    private Integer menuSortno;

    private Integer menuIsusing;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getMenuParentid() {
        return menuParentid;
    }

    public void setMenuParentid(Long menuParentid) {
        this.menuParentid = menuParentid;
    }

    public String getMenuText() {
        return menuText;
    }

    public void setMenuText(String menuText) {
        this.menuText = menuText == null ? null : menuText.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuIconcls() {
        return menuIconcls;
    }

    public void setMenuIconcls(String menuIconcls) {
        this.menuIconcls = menuIconcls == null ? null : menuIconcls.trim();
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Integer getMenuIchecked() {
        return menuIchecked;
    }

    public void setMenuIchecked(Integer menuIchecked) {
        this.menuIchecked = menuIchecked;
    }

    public Integer getMenuSortno() {
        return menuSortno;
    }

    public void setMenuSortno(Integer menuSortno) {
        this.menuSortno = menuSortno;
    }

    public Integer getMenuIsusing() {
        return menuIsusing;
    }

    public void setMenuIsusing(Integer menuIsusing) {
        this.menuIsusing = menuIsusing;
    }
}