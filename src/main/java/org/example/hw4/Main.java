package org.example.hw4;

import org.example.hw4.controller.StudentController;
import org.example.hw4.controller.TeacherController;
import org.example.hw4.repository.StudentRepository;
import org.example.hw4.repository.TeacherRepository;
import org.example.hw4.service.StudentService;
import org.example.hw4.service.TeacherService;
import org.example.hw4.view.SortType;
import org.example.hw4.view.StudentView;
import org.example.hw4.view.TeacherView;


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

        teacherView.create("Elena Viktorovna", 35, "4789" );
        teacherView.create("Oleg Petrovich", 45, "4456" );
        teacherView.create("Alena Ivanovna", 33, "1146" );
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

}