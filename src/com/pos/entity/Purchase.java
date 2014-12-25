package com.pos.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by alexandrenguyen on 25/12/14.
 */

@Entity
public class Purchase {

    private Long id;
    private Transaction transaction;
    private BigDecimal amount;
    private String registry_number;
    private String payment_type;
    private boolean is_convertible;
    private ProductType product_type;
    private ProductType only_product;
    private Timestamp created_at;
    private Timestamp updated_at;

    public ProductType getOnly_product() {
        return only_product;
    }

    public void setOnly_product(ProductType only_product) {
        this.only_product = only_product;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

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

    public boolean isIs_convertible() {
        return is_convertible;
    }

    public void setIs_convertible(boolean is_convertible) {
        this.is_convertible = is_convertible;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public ProductType getProduct_type() {
        return product_type;
    }

    public void setProduct_type(ProductType product_type) {
        this.product_type = product_type;
    }

    public String getRegistry_number() {
        return registry_number;
    }

    public void setRegistry_number(String registry_number) {
        this.registry_number = registry_number;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
