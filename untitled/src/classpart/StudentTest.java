package classpart;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "이순신");
        studentLee.address = "조선";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "신라";

        studentLee.showStudentInfor();
        studentKim.showStudentInfor();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
