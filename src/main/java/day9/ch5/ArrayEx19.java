package day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
                {51, 52, 53},
        };
        /*
         * 번호    국어  영어  수학  총점  평균
         * ----------------------------------
         * 1      101  102   103   306  102.0
         * 2      ...
         *
         * 5      51   52    53    156   52.0
         * ----------------------------------
         * 총점   ??    ??    ??
         *
         * */

        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;
        int sum = 0;

        for (int i = 0; i < score[0].length; i++) {

            for (int j = 0; j < score.length; j++) {
                if (i == 0) {
                    korSum += score[j][i];
                } else if (i == 1) {
                    engSum += score[j][i];
                } else {
                    mathSum += score[j][i];
                }

            }
        }




        System.out.println("번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + 1 + "\t\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t\t");
                sum += score[i][j];

            }
            System.out.print(sum + "\t\t");
            System.out.print((double) sum / score[i].length);
            System.out.println();
            sum = 0;
        }

        System.out.println("----------------------------------------------");
        System.out.println("총점\t\t" + korSum + "\t\t" + engSum + "\t\t" + mathSum);



        /* -------------------------------------------------------- */
        // !!!

        System.out.println("\n\n\n\n\n\n\n\n");
        int[][] score2 = {
                { 101, 102, 103 }
                , {  21,  22,  23 }
                , {  31,  32,  33 }
                , {  41,  42,  43 }
                , {  51,  52,  53 }
        };
        int[] sumArr = new int[score2[0].length];

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("----------------------------------");
        for(int i = 0; i< score2.length; i++) {
            System.out.printf("%d", i+1);
            int sum2 = 0;
            for(int z = 0; z < score2[i].length; z++) {
                int val = score2[i][z];
                sumArr[z] += val;                                               // !!! // !!! // !!!
                sum2 += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float)sum2 / score2[i].length;
            System.out.printf("\t%d\t%.1f\n", sum2, avg);
        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for(int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();

    }
}
