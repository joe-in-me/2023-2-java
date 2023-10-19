package day16.ch7;

class TimeTest {


    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        System.out.println(time);

        System.out.println("-----------");

        time.setMinute(30);
        System.out.println(time);

        System.out.println("-----------");

        time.setHour(30);
        System.out.println(time);
        time.setHour(-30);
        System.out.println(time);
    }
}

public class Time {

    private final int MIN_NUM = 0;
    private final int MAX_NUM = 23;

    private int hour;
    private int minute;
    private int second;

    // 초기화 (값 입력)
    // 생성자 방식
    public Time(int hour, int minute, int second) {
//        if (hour > 23) hour = 23;
//        if (hour < 0) hour = 0;
//        hour = hour > 23 ? 23 : (hour < 0 ? 0 : hour);
        this.hour = hour > MAX_NUM ? MAX_NUM :
                (hour < MIN_NUM ? MIN_NUM : hour);

        this.minute = minute;
        this.second = second;


    }

    // 초기화 (값 입력)
    // 메소드를 통한 방식 (setter)
    // 생성자와 다르게 지속적인 수정 가능.
    public void setHour(int hour) {
//        if (hour > 23) hour = 23;
//        if (hour < 0) hour = 0;
//        hour = hour > 23 ? 23 : (hour < 0 ? 0 : hour);
        this.hour = hour > MAX_NUM ? MAX_NUM :
                (hour < MIN_NUM ? MIN_NUM : hour);
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // 값 가져오기
    // 메소드를 통한 방식 뿐. (getter)
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
//        String parseString;
//        if(this.hour < 10){
//            parseString = "0" + this.hour;
//        }else {
//            parseString = String.valueOf(this.hour);
//        }


        // !!!
        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
    }
}
