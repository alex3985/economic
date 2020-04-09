package com.khpi.economic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factor_changing_complexity_intensity")
public class Factor {

    @Id
    @Column(name = "factor_id")
    private int id;

    @Column
    private String name;

    @Column(name = "content_factor")
    private String contentFactor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentFactor() {
        return contentFactor;
    }

    public void setContentFactor(String contentFactor) {
        this.contentFactor = contentFactor;
    }

}