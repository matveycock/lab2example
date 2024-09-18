package controller;

import service.StudentService;
import view.StudentView;

import java.util.Scanner;

public class StudentController {

    private final StudentView view = new StudentView();

    private final StudentService service = new StudentService();

    public void addStudent() {
        var scanner = new Scanner(System.in);

        view.printCreate();
        view.printAge();
        var age = scanner.nextInt();
        view.printName();
        var name = scanner.next();

        service.createNewStudent(age, name);
    }

    public void getStudent() {
        var scanner = new Scanner(System.in);

        view.printFind();
        view.printName();
        var name = scanner.next();

        view.printStudent(service.getStudent(name));
    }

    public void getAllStudents() {
        service.getAllStudent().forEach(view::printStudent);
    }

    public void getStudentFiltered() {
        var scanner = new Scanner(System.in);
        view.printStatement();
        var statement = scanner.nextInt();
        view.printValue();
        var value = scanner.nextInt();

        service.getStudentFiltered(statement, value).forEach(view::printStudent);
    }

}
