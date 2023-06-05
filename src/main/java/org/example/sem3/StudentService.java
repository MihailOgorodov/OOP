package org.example.sem3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public void sortName() {
        Collections.sort(studentRepository);
    }

    public void sortLastName() {
        Collections.sort(studentRepository, new StudentComparator());
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

}
