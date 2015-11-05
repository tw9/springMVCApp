package com.finance.beans;

import org.springframework.stereotype.Repository;

/**
 * Created by taylor on 11/5/15.
 */
@Repository
public class Location {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationaddress() {
        return locationaddress;
    }

    public void setLocationaddress(String locationaddress) {
        this.locationaddress = locationaddress;
    }

    private String locationaddress;

}
