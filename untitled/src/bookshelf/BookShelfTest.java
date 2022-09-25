package bookshelf;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue shelfQueue = new Bookshelf();
        shelfQueue.enQueue("tae1");
        shelfQueue.enQueue("tae2");
        shelfQueue.enQueue("tae3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
