package abstractex;

public class ComputerTest {

    public static void main(String[] args) {

        // Computer c1 = new Computer(); Error -> Computer의 추상메서드들이 구현되지 않았기 때문에
        Computer c2 = new DeskTop();
        // Computer c3 = new NoteBook(); Error -> 추상 메서드 1개가 구현이 되지 않았기 때문에

        Computer c4 = new MyNoteBook();

        c4.typing();
        c4.display();
    }
}
