//package org.example.hw5.controller;
//
//import org.example.hw5.model.Student;
//import org.example.hw5.model.Teacher;
//import org.example.hw5.service.StudentService;
//import org.example.hw5.service.StudyGroupService;
//import org.example.hw5.service.UserService;
//
//import java.util.List;
//
//public class StudentController implements UserController<Student> {
//
//    public UserService<Student> studentService;
//
//    StudyGroupService studyGroupService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//        studyGroupService = new StudyGroupService();
//    }
//
//    @Override
//    public void create(String fullName, Integer age, String phoneNumber) {
//        studentService.create(fullName, age, phoneNumber);
//    }
//
//    @Override
//    public List<Student> getAllSortUsers() {
//        return studentService.getAllSortUsers();
//    }
//
//    @Override
//    public List<Student> getAllSortUsersByFamilyName() {
//        return studentService.getAllSortUsersByFamilyName();
//    }
//
//    @Override
//    public void removeUser(String fullName) {
//        studentService.removeUser(fullName);
//        return true;
//    }
//
//    @Override
//    public List<Student> getAll() {
//        return studentService.getAll();
//    }
//
//    @Override
//    public List<Student> getAllSortUsersByAge() {
//        return studentService.getAllSortUsersByAge();
//    }
//    public void createStudyGroup(Teacher teacher, List<Student> students){
//        studyGroupService.createStudyGroup(teacher, students);
//
//    }
//
//    public Student getStudentInStudentGroup(String fullName){
//        return (Student) studyGroupService.getStudentFromStudentGroup(fullName);
//
//    }
//
//    public List<Student> getSortedListStudentFromStudentGroup(){
//        return studyGroupService.getSortedStudentGroup();
//
//    }
//
//    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
//        return studyGroupService.getSortedByFIOStudentGroup();
//
//    }
//}
