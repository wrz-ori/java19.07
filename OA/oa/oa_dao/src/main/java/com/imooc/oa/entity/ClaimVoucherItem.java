package com.imooc.oa.entity;

public class ClaimVoucherItem {
    private Integer id;

    private Integer claimVoucherId;
//申请的报销的一项
    private String item;
//总价
    private Double amount;
//注释
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}