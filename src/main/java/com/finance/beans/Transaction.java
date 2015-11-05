package com.finance.beans;

import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by taylor on 7/21/15.
 */
@Repository
public class Transaction {

    // field with underline : quote with other entity field

    private Integer id;
    private Timestamp recordtime;
    private Date realdate;
    private Time realtime;
    private double amount;
    private Integer use_id;
    private Integer payment_id;
    private Integer  location_id;
    private Integer user_id;
    private String photo_path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    public Date getRealdate() {
        return realdate;
    }

    public void setRealdate(Date realdate) {
        this.realdate = realdate;
    }

    public Time getRealtime() {
        return realtime;
    }

    public void setRealtime(Time realtime) {
        this.realtime = realtime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getUse_id() {
        return use_id;
    }

    public void setUse_id(Integer use_id) {
        this.use_id = use_id;
    }

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }
}
