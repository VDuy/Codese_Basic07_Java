package model;

public class QuanLy {
    private Student[] StudentList;
    private int studentID;

    public QuanLy(int max) {
        studentID = 0;
        StudentList = new Student[max];
    }

    public Student[] getStudentList() {
        return StudentList;
    }

    public Boolean add(Student student) {
        if (student != null) {
            StudentList[studentID++] = student;
            return true;
        }
        return false;
    }

    public Student search(String name) {
        for (int i = 0; i < this.StudentList.length; i++) {
            if (this.StudentList[i].getName().equals(name) == true) {
                return this.StudentList[i];
            }
        }
        return null;
    }

    public Boolean delete(String name) {
        for (int i = 0; i < this.StudentList.length; i++) {
            if (this.StudentList[i].getName().equals(name) == true) {
                for (int j = i; j < studentID - 1; j++) {
                    this.StudentList[j] = this.StudentList[j++];
                }
            }
        }
        if (search(name) == null) {
            return true;
        } else {
            return false;
        }
    }

    public void sort() {
        for (int i = 0; i < studentID - 1; i++) {
            for (int j = i + 1; j < studentID; j++) {
                if (StudentList[i].getName().compareTo(StudentList[j].getName()) > 0) {
                    Student temp = StudentList[i];
                    StudentList[i] = StudentList[j];
                    StudentList[j] = temp;
                }
            }
        }
    }

    public void showInf(String name) {
        System.out.println(search(name).toString());
    }
}