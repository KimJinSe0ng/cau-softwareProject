package study.midterm.prob4;

public class Student {
    private String name;
    private int studentNo;
    private String studentNoString;

    String getName() {
        return name;
    }

    String getStudentNo() {
        return studentNoString;
    }
    void setName(String setname) {
        this.name = setname;
    }

    boolean isNameMatched(String checkName) {
        if (name == null) return false;
        else return name.equals(checkName);
    }

    void setStudentNo(String studentNoString) {
        this.studentNoString = studentNoString;
        String[] arr = studentNoString.split("-");
        String temp = arr[0] + arr[1];
        this.studentNo = Integer.parseInt(temp);
    }

    boolean isStudentNoMatched(int studentNo) {
        if (studentNo == this.studentNo) return true;
        else return false;
    }

    void delete() {
        name = null;
        studentNo = 0;
        studentNoString = null;
    }

    @Override
    public String toString() {
        return "name : " + name + ", studentNoString : " + studentNoString + ", studentNo : " + studentNo;
    }
}
