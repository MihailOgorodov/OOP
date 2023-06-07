package org.example.hw4.controller;

import org.example.hw4.model.Teacher;
import org.example.hw4.service.StudentService;
import org.example.hw4.service.TeacherService;
import org.example.sem4.controller.UserController;
import org.example.sem4.service.UserService;

import java.util.List;

public class TeacherController implements UserController {
    public UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public List getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List getAll() {
        return teacherService.getAll();
    }

    @Override
    public List getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }
}
