package com.khpi.economic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "system_type")
public class SystemType {

    @Id
    @Column(name = "system_type_id")
    private int id;

    @Column
    private String name;

    @OneToOne
    @JoinTable(name = "system_type_coefficient_a",
            joinColumns =
                    {@JoinColumn(name = "system_type_id", referencedColumnName = "system_type_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "coef_a_id", referencedColumnName = "coef_a_id")})
    private CoefficientA coefficientA;

    @OneToOne
    @JoinTable(name = "system_type_coefficient_e",
            joinColumns =
                    {@JoinColumn(name = "system_type_id", referencedColumnName = "system_type_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "coef_e_id", referencedColumnName = "coef_e_id")})
    private CoefficientE coefficientE;

    @OneToOne
    @JoinTable(name = "system_type_coefficient_g",
            joinColumns =
                    {@JoinColumn(name = "system_type_id", referencedColumnName = "system_type_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "coef_g_id", referencedColumnName = "coef_g_id")})
    private CoefficientG coefficientG;

    @OneToOne
    @JoinTable(name = "system_type_coefficient_h",
            joinColumns =
                    {@JoinColumn(name = "system_type_id", referencedColumnName = "system_type_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "coef_h_id", referencedColumnName = "coef_h_id")})
    private CoefficientH coefficientH;

    @OneToMany
    @JoinTable(name = "complexity_kloc_capacity_system_type",
            joinColumns =
                    {@JoinColumn(name = "system_type_id", referencedColumnName = "system_type_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "complexity_capacity_system_type_id", referencedColumnName = "complexity_capacity_system_type_id")})
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

    public CoefficientA getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA(CoefficientA coefficientA) {
        this.coefficientA = coefficientA;
    }

    public CoefficientE getCoefficientE() {
        return coefficientE;
    }

    public void setCoefficientE(CoefficientE coefficientE) {
        this.coefficientE = coefficientE;
    }

    public CoefficientG getCoefficientG() {
        return coefficientG;
    }

    public void setCoefficientG(CoefficientG coefficientG) {
        this.coefficientG = coefficientG;
    }

    public CoefficientH getCoefficientH() {
        return coefficientH;
    }

    public void setCoefficientH(CoefficientH coefficientH) {
        this.coefficientH = coefficientH;
    }


    public List<Capacity> getCapacityList() {
        return capacityList;
    }

    public void setCapacityList(List<Capacity> capacityList) {
        this.capacityList = capacityList;
    }

}