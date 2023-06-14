//package org.example.hw5.controller;
//
//import org.example.hw5.model.Student;
//import org.example.hw5.model.StudyGroup;
//import org.example.hw5.model.Teacher;
//import org.example.hw5.service.StudyGroupService;
//import org.example.hw5.service.UserService;
//
//import java.util.List;
//
//public class StudyGroupController implements UserController<StudyGroup> {
//    public UserService<StudyGroup> studentService;
//
//    StudyGroupService studyGroupService;
//
//    public StudyGroupController(StudyGroupService studyGroupService) {
//        this.studyGroupService = studyGroupService;
//        studyGroupService = new StudyGroupService();
//    }
//
//    @Override
//    public void create(String fullName, Integer age, String phoneNumber) {
//        studentService.create(fullName, age, phoneNumber);
//    }
//
//    @Override
//    public List<StudyGroup> getAllSortUsers() {
//        return null;
//    }
//
//
//    @Override
//    public List<StudyGroup> getAllSortUsersByFamilyName() {
//        return null;
//    }
//
//    @Override
//    public void removeUser(String fullName) {
//        return;
//    }
//
//    @Override
//    public List<StudyGroup> getAll() {
//        return null;
//    }
//
//    @Override
//    public List<StudyGroup> getAllSortUsersByAge() {
//        return null;
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
//
