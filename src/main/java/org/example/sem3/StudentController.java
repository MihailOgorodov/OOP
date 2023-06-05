package org.example.sem3;

import java.util.List;

public class StudentController {

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printAll() {
        studentService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void sortName() {
        studentService.sortName();
    }

    public void sortLastName() {
        studentService.sortLastName();
    }

    public List<Student> getStudentsList() {
        return studentService.getStudentsList();
    }

}
