package com.imooc.oa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ClaimVoucher {

    private Integer id;
//事由
    private String cause;
//部门号
    private String createSn;
    //发起日期

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date createTime;
//下一个处理人？？
    private String nextDealSn;
//总金额
    private Double totalAmount;
//状态
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCreateSn() {
        return createSn;
    }

    public void setCreateSn(String createSn) {
        this.createSn = createSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNextDealSn() {
        return nextDealSn;
    }

    public void setNextDealSn(String nextDealSn) {
        this.nextDealSn = nextDealSn;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Employee creater;
    private Employee dealer;

    public Employee getCreater() {

        return creater;
    }

    public void setCreater(Employee creater) {

        this.creater = creater;
    }

    public Employee getDealer() {

        return dealer;
    }

    public void setDealer(Employee dealer) {
        this.dealer = dealer;
    }
}