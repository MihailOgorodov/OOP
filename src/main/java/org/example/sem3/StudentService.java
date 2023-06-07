//package org.example.sem3;
//
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//public class StudentServiceOld {
//
//    private final StudentRepository studentRepository;
//
//    public StudentServiceOld(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public void addStudent(Student student){
//        studentRepository.addStudent(student);
//    }
//
//    public void deleteStudent(String fullName) {
//    }
//
//    public void sortName() {
//    }
//
//    public void sortLastName() {
//    }
//
////    public void printAll() {
////        for (Student student : studentRepository.getStudentGroup()) {
////            System.out.println(student);
////        }
////    }
////
////    public void deleteStudent(String fullName) {
////        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
////        while (iterator.hasNext()) {
////            if (iterator.next().getFullName().equals(fullName)) {
////                iterator.remove();
////            }
////        }
////    }
//
////    public void sortName() {
////        Collections.sort(studentRepository);
////    }
////
////    public void sortLastName() {
////        Collections.sort(studentRepository, new UserComparator());
////    }
////
////    public List<Student> getStudentsList() {
////        return studentsList;
////    }
//
//}
