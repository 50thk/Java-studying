package classex;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person();

        Class pClass1 = person.getClass();

        Class pClass2 = Person.class;

        System.out.println(pClass1.getName());
        System.out.println(pClass2.getName());
        // 동적로딩 - 있을 때 가져오는 것
        Class pClass3 = Class.forName("java.lang.String");
        System.out.println(pClass3.getName());

    }
}
