package com.apps.university.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "UNITS")
public class Unit {

    @Id
    @Column(name = "UNIT_CODE")
    private int unitCode;

    @Column(name = "UNIT_NAME")
    private String unitName;

    @OneToMany
    @JoinColumn(name = "LECTURER_ID")
    private List<Lecturer>lecturers;

    public Unit(int unitCode, String unitName, List<Lecturer> lecturers) {
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.lecturers = lecturers;
    }

    public Unit() {

    }

    public int getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(int unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitCode=" + unitCode +
                ", unitName='" + unitName + '\'' +
                ", lecturers=" + lecturers +
                '}';
    }

}
