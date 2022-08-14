public class GuGuDan {
    public void dan(int n) {
        for(int i=1; i<10; i++) {
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        GuGuDan gugu = new GuGuDan();
        for (int i = 2; i < 10; i++) {
            System.out.println(i+"dan");
            gugu.dan(i);
        }
    }
}
