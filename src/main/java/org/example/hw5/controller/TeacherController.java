package org.example.hw5.controller;

import org.example.hw5.model.Teacher;
import org.example.hw5.service.TeacherService;
import org.example.hw5.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    public UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public void removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }
}
