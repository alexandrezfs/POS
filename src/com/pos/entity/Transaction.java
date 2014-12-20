package com.pos.entity;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by alexandrenguyen on 15/12/14.
 */

@Entity
public class Transaction {

    private Timestamp created_at;
    private Timestamp updated_at;

}
