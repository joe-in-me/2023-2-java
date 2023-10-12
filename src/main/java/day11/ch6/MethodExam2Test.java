package day11.ch6;

public class MethodExam2Test {

    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String result1 = me2.scoreResultOpt(69);
        System.out.println("result1 = " + result1);


        for (int i = 0; i < 100; i++) {
            int score = (int) (Math.random() * 100) + 1;
            System.out.print("score = " + score + "\t\t");
            System.out.println(me2.scoreResultOpt(score));

        }

        /*
         * 100 초과 0 미만은 "점수를 확인해 주세요" 값 리턴
         * A학점 1의자리 8점이상 -> + , 3점이하 -> - 나머지 0 90 이상
         * B학점 1의자리 8점이상 -> + , 3점이하 -> - 나머지 0 80 이상
         * C학점 1의자리 8점이상 -> + , 3점이하 -> - 나머지 0 70 이상
         * D학점 + - 0 없음.            70 미만
         * */



        //

        String season = me2.getSeason(6);
        System.out.println("season = " + season);
        /*
        * 3, 4, 5 -> "봄" 리턴;
        * 6, 7, 8 -> "여름" 리턴
        * 9, 10, 11 -> "가을" 리턴
        * 12, 1, 2 -> "겨울" 리턴
        * 나머지 >> 없음
        *
        * */



        //






    }

}
