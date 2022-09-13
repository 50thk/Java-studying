package inheritance;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("animal move");
    }
}

class Human extends Animal{
    public void move() {
        System.out.println("Human move with two foot");
    }
}

class Tiger extends Animal{
    public void move() {
        System.out.println("tiger run with four foot");
    }
}

class Eagle extends Animal{
    public void move() {
        System.out.println("Eagle fly the sky");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

        Animal[] animalList = new Animal[3];
        animalList[0] = new Human();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
