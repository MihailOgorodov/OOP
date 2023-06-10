package org.example.hw5.view;

import org.example.hw5.controller.UserController;
import org.example.hw5.model.Student;
import org.example.hw5.model.StudyGroup;

import java.util.List;

public class StudyGroupView implements UserView<StudyGroup>{
    UserController<StudyGroup> controller;

    public StudyGroupView(UserController<StudyGroup> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<StudyGroup> studyGroups = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (studyGroups == null)  {
            System.out.println("studyGroups is null");
            return;
        }
        System.out.println("=====================");
        for (StudyGroup studyGroup : studyGroups) {
            System.out.println(studyGroup);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

    }


    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }
}
