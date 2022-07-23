package com.apps.university.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "LECTURERS")

public class Lecturer {

    @Id
    @Column(name = "LECTURER_ID")
    private int lecturerId;

    @Column(name = "LECTURER_NAME")
    private String lecturerName;

    @Column(name = "GENDER")
    private char gender;

    @Column(name = "FACULTY")
    private String faculty;

    @OneToMany
    @JoinColumn(name = "STUDENT_ID")
    private List<Students>students;

    public Lecturer(int lecturerId, String lecturerName, char gender, String faculty, List<Students> students) {
        this.lecturerId = lecturerId;
        this.lecturerName = lecturerName;
        this.gender = gender;
        this.faculty = faculty;
        this.students = students;
    }

    public Lecturer() {

    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerId=" + lecturerId +
                ", lecturerName='" + lecturerName + '\'' +
                ", gender=" + gender +
                ", faculty='" + faculty + '\'' +
                ", students=" + students +
                '}';
    }

}
