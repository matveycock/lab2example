import controller.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню\n1.Добавить студента\n2.Найти студента по имени\n3.Вывести всех студентов\n4.Отфильтровать студентов по возрасту");
            switch (scanner.nextInt()) {
                case (1):
                    controller.addStudent();
                    break;
                case (2):
                    controller.getStudent();
                    break;
                case (3):
                    controller.getAllStudents();
                    break;
                case(4):
                    controller.getStudentFiltered();
                    break;
            }
        }
    }
}