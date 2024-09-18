package service;

import model.Student;
import repository.StudentRepository;

import java.util.List;


public class StudentService {

    private final StudentRepository repository = new StudentRepository();

    public void createNewStudent(int age, String name) {
        Student student = new Student(name, age);

        repository.addStudent(student);
    }

    public Student getStudent(String name) {
        return repository.findAllStudents().stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudent() {
        return repository.findAllStudents();
    }

    public List<Student> getStudentFiltered(int statement, int value) {
        if (statement == 1) {
            return repository.findAllStudents().stream()
                    .filter(student -> student.getAge() > value)
                    .toList();
        }
        if (statement == 2) {
            return repository.findAllStudents().stream()
                    .filter(student -> student.getAge() < value)
                    .toList();
        }
        return null;
    }

}
