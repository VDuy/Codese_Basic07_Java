package controller;

import model.HighSchoolStudent;
import model.StudentRepository;
import model.UniversityStudent;

public class StudentController {
    StudentRepository repo = new StudentRepository();

    public void addStudentToList() {
        int ID;
        int name;
        int address;

        UniversityStudent universityStudent = new UniversityStudent(0001, "Duy", "Hn");
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(01, "Vu", "Bg");

        repo.addStudent(universityStudent);
        repo.addStudent(highSchoolStudent);

    }

    public void printAllStudent() {
        this.repo.getAllStudent();
    }
}