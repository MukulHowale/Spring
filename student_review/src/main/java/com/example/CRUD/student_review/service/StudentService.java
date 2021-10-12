package com.example.CRUD.student_review.service;

import com.example.CRUD.student_review.entiry.Student;
import com.example.CRUD.student_review.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

//    Help while testing corner case data and on that we check our logic
//    Dependency Injection
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){

        List<Student> studentInfo = studentRepository.findAll();
        return studentInfo;
    }

    public Student addStudent(Student student) {

        Student student1 = studentRepository.save(student);

        return student1;
    }

    public String updateStudent(Student student) {

//        Step 1. Fetch the student object whose id is equal to the passed student id

        Optional<Student> student1 = studentRepository.findById(student.getStudentId());

        // In some cases a null value might be returned which will cause
        // null pointer exception, here Optional can be used which has
        // methods to check the value

        if(student1.isEmpty()){
            return "Repository Empty";
        }


        // updated the student info
        // to get the object from the optional type
        student1.get().setStudentName(student.getStudentName());
        student1.get().setStudentSection(student.getStudentSection());


        // Save the student info
        studentRepository.save(student1.get());

        return "Info Updated";

    }

    public String deleteStudent(String studentId) {

        //Fetch the object
        Optional<Student> student1 = studentRepository.findById(studentId);

        try {
            studentRepository.delete(student1.get());
            return "Successfully Deleted";
        }
        catch (Exception e){
            return "Delete Failed";
        }
    }
}
