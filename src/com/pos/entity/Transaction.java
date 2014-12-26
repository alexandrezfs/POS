package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by alexandrenguyen on 15/12/14.
 */

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private BigDecimal gift_card_amount;

    @Column
    private BigDecimal coupon_amount;

    @Column
    private BigDecimal coupon_amount_used;

    @Column
    private BigDecimal exchange_amount;

    @Column
    private BigDecimal exchange_amount_used;

    @Column
    private BigDecimal converted_coupon_exchange;

    @Column
    private BigDecimal priceoff_amount;

    @Column
    private BigDecimal direct_exchange;

    @Column
    private BigDecimal credit_card_amount;

    @Column
    private BigDecimal check_amount;

    @Column
    private BigDecimal cash_amount;

    @Column
    private BigDecimal cash_amount_real;

    @Column
    private BigDecimal cash_amount_emitted;

    @Column
    private BigDecimal cash_amount_emitted_real;

    @Column
    private BigDecimal emitted_coupon_amount;

    @Column
    private BigDecimal total_sold_amount;

    @Column
    private BigDecimal total_bought_amount;

    @Column
    private BigDecimal product_count;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    public BigDecimal getCash_amount() {
        return cash_amount;
    }

    public void setCash_amount(BigDecimal cash_amount) {
        this.cash_amount = cash_amount;
    }

    public BigDecimal getCash_amount_emitted() {
        return cash_amount_emitted;
    }

    public void setCash_amount_emitted(BigDecimal cash_amount_emitted) {
        this.cash_amount_emitted = cash_amount_emitted;
    }

    public BigDecimal getCash_amount_emitted_real() {
        return cash_amount_emitted_real;
    }

    public void setCash_amount_emitted_real(BigDecimal cash_amount_emitted_real) {
        this.cash_amount_emitted_real = cash_amount_emitted_real;
    }

    public BigDecimal getCash_amount_real() {
        return cash_amount_real;
    }

    public void setCash_amount_real(BigDecimal cash_amount_real) {
        this.cash_amount_real = cash_amount_real;
    }

    public BigDecimal getCheck_amount() {
        return check_amount;
    }

    public void setCheck_amount(BigDecimal check_amount) {
        this.check_amount = check_amount;
    }

    public BigDecimal getConverted_coupon_exchange() {
        return converted_coupon_exchange;
    }

    public void setConverted_coupon_exchange(BigDecimal converted_coupon_exchange) {
        this.converted_coupon_exchange = converted_coupon_exchange;
    }

    public BigDecimal getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(BigDecimal coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public BigDecimal getCoupon_amount_used() {
        return coupon_amount_used;
    }

    public void setCoupon_amount_used(BigDecimal coupon_amount_used) {
        this.coupon_amount_used = coupon_amount_used;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public BigDecimal getCredit_card_amount() {
        return credit_card_amount;
    }

    public void setCredit_card_amount(BigDecimal credit_card_amount) {
        this.credit_card_amount = credit_card_amount;
    }

    public BigDecimal getDirect_exchange() {
        return direct_exchange;
    }

    public void setDirect_exchange(BigDecimal direct_exchange) {
        this.direct_exchange = direct_exchange;
    }

    public BigDecimal getEmitted_coupon_amount() {
        return emitted_coupon_amount;
    }

    public void setEmitted_coupon_amount(BigDecimal emitted_coupon_amount) {
        this.emitted_coupon_amount = emitted_coupon_amount;
    }

    public BigDecimal getExchange_amount() {
        return exchange_amount;
    }

    public void setExchange_amount(BigDecimal exchange_amount) {
        this.exchange_amount = exchange_amount;
    }

    public BigDecimal getExchange_amount_used() {
        return exchange_amount_used;
    }

    public void setExchange_amount_used(BigDecimal exchange_amount_used) {
        this.exchange_amount_used = exchange_amount_used;
    }

    public BigDecimal getGift_card_amount() {
        return gift_card_amount;
    }

    public void setGift_card_amount(BigDecimal gift_card_amount) {
        this.gift_card_amount = gift_card_amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPriceoff_amount() {
        return priceoff_amount;
    }

    public void setPriceoff_amount(BigDecimal priceoff_amount) {
        this.priceoff_amount = priceoff_amount;
    }

    public BigDecimal getProduct_count() {
        return product_count;
    }

    public void setProduct_count(BigDecimal product_count) {
        this.product_count = product_count;
    }

    public BigDecimal getTotal_bought_amount() {
        return total_bought_amount;
    }

    public void setTotal_bought_amount(BigDecimal total_bought_amount) {
        this.total_bought_amount = total_bought_amount;
    }

    public BigDecimal getTotal_sold_amount() {
        return total_sold_amount;
    }

    public void setTotal_sold_amount(BigDecimal total_sold_amount) {
        this.total_sold_amount = total_sold_amount;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
