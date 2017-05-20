package com.apress.messaging.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Rate {

    @Id
    private String code;
    private Float rate;

    @JsonIgnore
    @Temporal(TemporalType.DATE)
    private Date date;

    public Rate() {

    }

    public Rate(String base, Float rate, Date date) {
        this.code = base;
        this.rate = rate;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String base) {
        this.code = base;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        return "Rate [code=" + code + ", rate=" + rate + ", date=" + format + "]";
    }

}

