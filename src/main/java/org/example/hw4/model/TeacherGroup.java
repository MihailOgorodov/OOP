package org.example.hw4.model;

import lombok.Getter;
import lombok.ToString;
import org.example.hw4.service.TeacherGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

@Getter
@ToString
public class TeacherGroup implements Iterable<Teacher> {

    private final List<Teacher> teacherList;

    public TeacherGroup() {
        teacherList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teacherList);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
}
