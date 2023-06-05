package org.example.sem3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.get().compareTo(s2.getLastName());
    }
}
