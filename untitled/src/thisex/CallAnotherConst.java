package thisex;

class Person{

    String name;
    int age;

    public Person() {
        /*
        default에 construct call을 사용하면 어떠한 언어도 있으면 안됨.
         */
        this("nan", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }

}

public class CallAnotherConst {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());

    }
}
