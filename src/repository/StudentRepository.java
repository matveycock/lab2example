package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<Student> studentList = new ArrayList<>();

    public List<Student> findAllStudents() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


}
