package staticex;

public class Student {
    /*
    지역변수 - 함수 내부에 선언, 함수 내부에서만 사용, 스택메모리, 함수가 호출될 때 생성되고 끝나면 소멸
    멤버변수(인스턴스 변수) - 클래스 멤버 변수로 선언, 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능, 힙메모리, 인스턴스가 생성될 때 힙에 생성되고 가비지 컬렉터가 메모리를 수거할 때 소멸
    static 변수(클래스 변수) - static 예악어를 사용하여 클래스 내부에 선언, 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능, 데이터 영역, 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해체할 때 소멸
     */
    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

}
