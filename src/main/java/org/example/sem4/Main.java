package org.example.sem4;

import org.example.sem4.controller.StudentController;
import org.example.sem4.repository.StudentRepository;
import org.example.sem4.service.StudentService;
import org.example.sem4.view.SortType;
import org.example.sem4.view.StudentView;


public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
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

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

}