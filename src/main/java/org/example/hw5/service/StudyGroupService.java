//package org.example.hw5.service;
//
//import org.example.hw5.model.Student;
//import org.example.hw5.model.StudyGroup;
//import org.example.hw5.model.Teacher;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//
//public class StudyGroupService {
//    private StudyGroup studyGroup;
//
//    public StudyGroupService() {
//    }
//
//    public void createStudyGroup(Teacher teacher, List<Student> students) {
//        this.studyGroup = new StudyGroup(teacher, students);
//    }
//
//    public StudyGroup getStudyGroup() {
//        return studyGroup;
//    }
//
//    public List<Student> getStudentFromStudentGroup(String fullName) {
//        Iterator<Student> iterator = studyGroup.iterator();
//        List<Student> result = new ArrayList<>();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getFullName().equalsIgnoreCase(fullName)) {
//                result.add(student);
//            }
//        }
//        if (result.size() == 0) {
//            throw new IllegalStateException(
//                    String.format("Студент с именем %s не найден", fullName)
//            );
//        }
//        if (result.size() != 1) {
//            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
//        }
//
//        return result;
//    }
//
//    public List<Student> getSortedStudentGroup() {
//        List<Student> students = new ArrayList<>(studyGroup.getStudentsList());
//        Collections.sort(students);
//        return students;
//    }
//
//    public List<Student> getSortedByFIOStudentGroup() {
//        List<Student> students = new ArrayList<>(studyGroup.getStudentsList());
//        students.sort(new UserComparator<Student>());
//        return students;
//    }
//}
//
//
