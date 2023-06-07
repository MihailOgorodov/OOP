//package org.example.sem4.service;
//
//import org.example.sem4.model.Student;
//import org.example.sem4.repository.StudentRepository;
//
//import java.util.Collections;
//import java.util.Iterator;
//
//public class StudentServiceOld {
//
//    private final StudentRepository studentRepository;
//
//    public StudentServiceOld(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public void addStudent(Student student) {
//        studentRepository.addStudent(student);
//    }
//    public void printAll() {
//        System.out.println("-----------------------------------");
//        for (Student student : studentRepository.getStudentGroup()) {
//            System.out.println(student);
//        }
//        System.out.println("-----------------------------------");
//    }
//
//    public void deleteStudent(String fullName) {
//        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().getFullName().equals(fullName)) {
//                iterator.remove();
//            }
//
//        }
//    }
//
//    public void sortStudents() {
//        Collections.sort(studentRepository.getStudentGroup().getStudentsList);
//    }
//
//    public void sortByFamilyName() {
//        studentRepository.getStudentGroup().getStudentsList.sort(new UserComparator<Student>());
//    }
//}
