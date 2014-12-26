package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alexandrenguyen on 25/12/14.
 */
public class Store {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String store_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }
}