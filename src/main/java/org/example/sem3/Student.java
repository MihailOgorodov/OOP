package org.example.sem3;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    public Student(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
}
