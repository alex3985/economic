package com.khpi.economic.entity;

import javax.persistence.*;

@Entity
@Table(name = "complexity_kloc_capacity_system_type")
public class Capacity {

    @Id
    @Column(name = "complexity_capacity_system_type_id")
    private int id;

    @Column
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "complexity_id")
    private SystemComplexity systemComplexity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public SystemComplexity getSystemComplexity() {
        return systemComplexity;
    }

    public void setSystemComplexity(SystemComplexity systemComplexity) {
        this.systemComplexity = systemComplexity;
    }

}