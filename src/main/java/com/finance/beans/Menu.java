package com.finance.beans;

import org.springframework.stereotype.Repository;

/**
 * Created by taylor on 11/4/15.
 */
@Repository
public class Menu {
    private String menuid;
    private String menuname;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }
}
