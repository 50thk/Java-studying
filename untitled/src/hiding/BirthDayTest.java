package hiding;
/*
접근제어자
public - 모든 class에서 접근 가능
private - 해당 class 내에서만 접근 가능
default - 해당 package 내에서만 접근 가능
protect - 평소엔 private, 상속관계에서만 public
 */
class BirthDay {

    private int day;
    private int month;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("Month error");
        }
        else{
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(month == 2) {
            if(day < 1 || day > 28) {
                System.out.println("Day error.");
            }
            else{
                this.day = day;
            }
        }
        else if(day < 1 || day > 31) {
            System.out.println("Day error.");
        }
        else {
            this.day = day;
        }
    }

    public void showBirthDay() {
        System.out.print(year + "." + month + "." + day);
    }
}

public class BirthDayTest {

    public static void main(String[] args) {

        BirthDay day = new BirthDay();

        day.setMonth(2);
        day.setYear(2018);
        day.setDay(28);

        day.showBirthDay();
    }
}
