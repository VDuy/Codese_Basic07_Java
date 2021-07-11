import model.HighSchoolStudent;
import model.QuanLy;
import model.Student;
import model.UniversityStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(01, "Duy", "HN");
        UniversityStudent universityStudent = new UniversityStudent(0001, "Vu", "BG");

        ArrayList<Student> danhsach;
        danhsach = new ArrayList<>();

        danhsach.add(universityStudent);
        danhsach.add(highSchoolStudent);

    }
}
