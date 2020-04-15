package com.khpi.economic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coefficient_changing_complexity_production_pc")
public class CoefficientComplexityProduction {

    @Id
    @Column(name = "coefficient_complexity_id")
    private int id;

    @Column
    private double value;

    @ManyToOne
    @JoinColumn(name = "type_grade_id")
    private TypeGrade typeGradeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public TypeGrade getTypeGradeList() {
        return typeGradeList;
    }

    public void setTypeGradeList(TypeGrade typeGradeList) {
        this.typeGradeList = typeGradeList;
    }

}