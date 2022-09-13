package interfaceex;

// extends로의 상속은 1개밖에 못받지만, implements는 여러개 상속 가능
public abstract class Calculator implements Calc{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
