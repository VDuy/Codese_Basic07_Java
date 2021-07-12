package model;

import java.util.ArrayList;

public class StudentRepository {
    ArrayList<Student> database;

    public void addStudent(Student student) {
        database.add(student);
    }

    public ArrayList<Student> getAllStudent() {
        return this.database;
    }

    public Student getByID(int id) {
        for (int i = 0; i < this.database.size(); i++) {
            if (database.get(i).getID() == id) {
                return database.get(i);
            }
        }
        return null;
    }

    public double getAverageScore(Student student) {
        UniversityStudent universityStudent = new UniversityStudent(0001, "Duy", "Hn");
        return universityStudent.CPA;
    }

    public Student getAverage2Score(Student student) {

        return null;
    }

    public void deleteStudent(Student student){

    }

}
