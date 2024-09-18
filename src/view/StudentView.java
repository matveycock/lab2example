package view;

import model.Student;

public class StudentView {

    public void printCreate(){
        System.out.println("Введите данные для добавления студента");
    }

    public void printName(){
        System.out.println("имя:");
    }

    public void printAge(){
        System.out.println("возраст:");
    }

    public void printFind(){
        System.out.println("Введите имя для поиска студента");
    }

    public void printStudent(Student student){
        System.out.println("имя: " + student.getName());
        System.out.println("возраст: " + student.getAge());
    }

    public void printStatement(){
        System.out.println("1.Больше\n2.Меньше");
    }

    public void printValue(){
        System.out.println("Значение:");
    }

}
