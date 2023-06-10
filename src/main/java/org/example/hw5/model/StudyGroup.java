package org.example.hw5.model;

import lombok.Getter;
import lombok.Setter;
import org.example.hw5.service.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;
@Setter
@Getter

public class StudyGroup extends User implements Iterable<Student>{


    private Teacher teacher;
    private List<Student> studentsList;

    public StudyGroup(Teacher teacher, List<Student> studentsList) {
        this.studentsList = studentsList;
        this.teacher = teacher;
    }

    public String toString() {
        return "StudyGroup{" +
                "students=" + studentsList +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator((List<Student>) this);
    }

}
