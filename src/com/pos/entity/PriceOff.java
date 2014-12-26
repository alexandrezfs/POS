package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by alexandrenguyen on 25/12/14.
 */
public class PriceOff {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Transaction transaction;

    @Column
    private String salaryman_name;

    @Column
    private String payment_type;

    @Column
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getSalaryman_name() {
        return salaryman_name;
    }

    public void setSalaryman_name(String salaryman_name) {
        this.salaryman_name = salaryman_name;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
