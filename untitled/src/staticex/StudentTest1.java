package staticex;

public class StudentTest1 {

    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.studentID);
        Student studentT = new Student();
        System.out.println(studentT.studentID);

        /*
        instance 변수로 serialNum을 출력하는 것보다 class로 하는 것이 보편적
         */
//        System.out.println(studentJ.serialNum);
//        System.out.println(studentT.serialNum);
//        System.out.println(Student.serialNum);
        System.out.println(Student.getSerialNum());
    }
}
