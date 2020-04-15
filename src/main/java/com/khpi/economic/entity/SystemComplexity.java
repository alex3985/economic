package com.khpi.economic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "system_complexity")
public class SystemComplexity {

    @Id
    @Column(name = "complexity_id")
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "systemComplexity")
    private List<Capacity> capacityList;

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