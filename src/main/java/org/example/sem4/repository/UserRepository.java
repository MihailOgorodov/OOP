package org.example.sem4.repository;

import org.example.sem4.model.Student;
import org.example.sem4.model.User;

import java.util.List;

public interface UserRepository<T extends User> {
    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();
}
