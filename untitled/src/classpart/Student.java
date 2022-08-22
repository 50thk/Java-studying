package classpart;

public class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }
    /*
    생성자는 여러개 있을 수 있음.
    생성자명은 클래스명과 동일
     */
    public Student() {}

    public void showStudentInfor() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}