package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by alexandrenguyen on 25/12/14.
 */

@Entity
public class Settings {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String meta_name;

    @Column
    private String meta_value;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeta_name() {
        return meta_name;
    }

    public void setMeta_name(String meta_name) {
        this.meta_name = meta_name;
    }

    public String getMeta_value() {
        return meta_value;
    }

    public void setMeta_value(String meta_value) {
        this.meta_value = meta_value;
    }
}
