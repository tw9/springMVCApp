package com.finance.beans;

import org.springframework.stereotype.Repository;

/**
 * Created by taylor on 11/5/15.
 */
@Repository
public class Use {
    private Integer id;
    private String usename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }
}
