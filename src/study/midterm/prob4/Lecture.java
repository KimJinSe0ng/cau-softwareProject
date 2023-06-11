package study.midterm.prob4;

import java.util.Scanner;

public class Lecture {
    String lectureName;
    Student[] students;
    int currentCount;
    Scanner scanner = new Scanner(System.in);

    Lecture(String lectureName, int length) {
        this.lectureName = lectureName;
        students = new Student[length];
        for (int i = 0; i < length; i++) {
            students[i] = new Student();
        }
        this.currentCount = 0;
    }

    void searchStudentWithName(String findName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].isNameMatched(findName)) {
                System.out.println("There is " + students[i].getName() + " in seat " + i);
                return;
            }
        }
        System.out.println("There is no " + findName);
    }

    public static final void map() {

    }
    final public void ma() {

    }

    void insertStudent(String name, String studentNo, int seatNo) {
        students[seatNo - 1].setName(name);
        students[seatNo - 1].setStudentNo(studentNo);
        currentCount++;
    }

    void deleteStudent(int studentNo) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].isStudentNoMatched(studentNo)) {
                students[i].delete();
                currentCount --;
                return;
            }
        }
        System.out.println("There is No Student having " + studentNo);
    }

    void run() {
        System.out.println("Start!");
        insertStudent("Kim", "2020-0000", 1);
        insertStudent("Lee", "2020-1111", 2);
        insertStudent("Jin", "2020-2222", 3);
        insertStudent("Song", "2020-3333", 4);
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
        searchStudentWithName("Jin");
        searchStudentWithName("Hi");
        deleteStudent(20201111);
        deleteStudent(20220000);
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }
}
