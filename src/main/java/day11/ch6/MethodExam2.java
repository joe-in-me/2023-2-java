package day11.ch6;

public class MethodExam2 {

    /* scoreResultOpt */
    String scoreResultOpt(int score) {
        if (score > 100 || score < 0) {
            return "점수를 확인해 주세요";
        }
        String grade;

        grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";

        int modVal = score % 10;
        String opt;
        opt = modVal >= 8 ? "+" : modVal <= 3 ? score == 100 ? "+" : "-" : "0";

//        return grade + opt;
        return String.format("%s%s", grade, opt);

    }

    /* scoreResultOpt */
    String scoreResultOpt(int score, int version) {
        if (score > 100 || score < 0) {
            return "점수를 확인해 주세요";
        }

        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            return grade;
        }

        int rest = score % 10;
        if (rest >= 8 || score == 100) {
            grade += "+";
        } else if (rest <= 3) {
            grade += "-";
        } else {
            grade += "0";
        }

        return grade;
    }


    /* getSeason */
    String getSeason(int i) {

        switch (i) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
            default:
                return "없음";
        }

    }

    /* getSeason */
    String getSeason(int i, int version) {
        String season;
        if (i == 3 || i == 4 || i == 5) {
            season = "봄";
        } else if (i == 6 || i == 7 || i == 8) {
            season = "여름";
        } else if (i == 9 || i == 10 || i == 11) {
            season = "가을";
        } else {
            season = "겨울";
        }
        return season;
    }

    /* getSeason */
    String getSeason(int i, int version, int version2) {
        String season;
        if (i < 1 || i > 12) {
            season = "없음";
        }
        if (i >= 3 && i <= 5) {
            season = "봄";
        } else if (i >= 6 && i <= 8) {
            season = "여름";
        } else if (i >= 9 && i <= 11) {
            season = "가을";
        } else {
            season = "겨울";
        }
        return season;
    }

    /* getSeason */
    String getSeason(int i, int version, int version2, int version3) {
        String season;
        if (i > 0 && i <= 12) {
            if (i == 1 || i == 12 || i == 11) {
                return "겨울";
            } else if (i <= 5) {
                return "봄";
            } else if (i <= 8) {
                return "여름";
            }
            return "가을";
        }
        return "없음";

    }
}
