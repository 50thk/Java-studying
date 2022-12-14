package gamelevel;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("slowly running");
    }

    @Override
    public void jump() {
        System.out.println("can't jump");
    }

    @Override
    public void turn() {
        System.out.println("can't turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***Beginner level***");
    }
}
