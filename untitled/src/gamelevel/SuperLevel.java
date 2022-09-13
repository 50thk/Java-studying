package gamelevel;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("very fast running");
    }

    @Override
    public void jump() {
        System.out.println("very high jump");
    }

    @Override
    public void turn() {
        System.out.println("turn around");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***Super level***");
    }
}
