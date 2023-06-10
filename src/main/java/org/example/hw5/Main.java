package org.example.hw5;

import org.example.hw5.controller.StudentController;
import org.example.hw5.controller.StudyGroupController;
import org.example.hw5.controller.TeacherController;
import org.example.hw5.repository.StudentRepository;
import org.example.hw5.repository.StudyGroupRepository;
import org.example.hw5.repository.TeacherRepository;
import org.example.hw5.service.StudentService;
import org.example.hw5.service.StudyGroupService;
import org.example.hw5.service.TeacherService;
import org.example.hw5.view.SortType;
import org.example.hw5.view.StudentView;
import org.example.hw5.view.StudyGroupView;
import org.example.hw5.view.TeacherView;


public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView teacherView = getTeacherView();
//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);

        teacherView.create("Elena Sidorova", 35, "4789" );
        teacherView.create("Oleg Petrovich", 45, "4456" );
        teacherView.create("Alena Ivanova", 33, "1146" );
        teacherView.sendOnConsole(SortType.AGE);



    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService(teacherRepository);
        TeacherController teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static StudyGroupView getStudyGroupView() {
        StudyGroupRepository studyGroupRepository = new StudyGroupRepository();
        StudyGroupService studyGroupService = new StudyGroupService(studyGroupRepository);
        StudyGroupController studyGroupController = new StudyGroupController(studyGroupService);
        return new StudyGroupView(studyGroupController);
    }


}