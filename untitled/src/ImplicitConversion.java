public class ImplicitConversion {
    //정수에서 실수, 작은 byte에서 큰 byte는 묵시적 형변환
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        System.out.println(num);

        long lNum = 10;
        float fNum = lNum;

        System.out.println(fNum);

        double dNum = fNum + num;
        System.out.println(dNum);
    }
}
