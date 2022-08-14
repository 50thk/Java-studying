package ifexample;

public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;
        /*
        조건을 간단히 정의할 수 있을 때
        정수뿐만 아니라 문자열도 가능
        ex) case "Gold"
         */

        switch(rank) {
            case 1: medalColor = 'G';
                    break;

            case 2: medalColor = 'S';
                    break;

            case 3: medalColor = 'B';
                    break;

            default: medalColor = 'A';
        }
        System.out.println(rank + "rank" + medalColor);
    }
}
