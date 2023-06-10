package org.example.hw5.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)

public class Teacher extends User implements Comparable<Teacher> {

    private String subordinate; //подчиненный

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }
    @Override
    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
        return String.format("Teacher: %s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
