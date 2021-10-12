package com.example.CRUD.student_review.entiry;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

//    primary key
    @Id
    private String StudentId;
    private String StudentName;
    private String StudentSection;

//    some binding thing in background used by @Entity
    public Student(){

    }

    public Student(String studentId, String studentName, String studentSection) {
        StudentId = studentId;
        StudentName = studentName;
        StudentSection = studentSection;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSection() {
        return StudentSection;
    }

    public void setStudentSection(String studentSection) {
        StudentSection = studentSection;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId='" + StudentId + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSection='" + StudentSection + '\'' +
                '}';
    }
}
