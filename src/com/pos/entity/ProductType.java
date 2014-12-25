package com.pos.entity;

import javax.persistence.Entity;

/**
 * Created by alexandrenguyen on 25/12/14.
 */

@Entity
public class ProductType {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}