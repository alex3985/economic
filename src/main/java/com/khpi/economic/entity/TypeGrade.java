package com.khpi.economic.entity;

import javax.persistence.*;

@Entity
@Table(name = "type_grade")
public class TypeGrade {

    @Id
    @Column(name = "type_grade_id")
    private int id;

    @Column
    private String name;

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

}