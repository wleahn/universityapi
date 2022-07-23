package com.apps.university.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "STUDENTS")

public class Students {

    @Id
    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "GENDER")
    private char gender;

    @OneToMany
    @JoinColumn(name = "UNIT_CODE")
    private List<Unit> units;

    public Students(Long studentId, String studentName, char gender, List<Unit> units) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.units = units;
    }

    public Students() {

    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", units=" + units +
                '}';
    }

}
