package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceImpl
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public class MemberServiceImpl implements MemberService {

    /**
     * BMI = w / t * t
     *고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     *
     * */
    @Override
    public String getBmi(BmiDTO param) {
        double bmi = param.getWei() / (param.getHei() * param.getHei()) * 10000;
        String s = "";
        if(bmi >= 35){
            s = "고도 비만";
        }else if(bmi >= 30){
            s = "중도(重) 비만 (2단계 비만)";
        }else if(bmi >= 25){
            s = "경도 비만 (1단계 비만)";
        }else if(bmi >= 23){
            s =  "과체중";
        }else if(bmi >= 18.5){
            s = "정상";
        }else {
            s = "저체중";
        }
        return param.getName() + ": " + s;
    }

    @Override
    public String getCalc(CalcDTO calc) {
        int res = 0;
        switch (calc.getOpcode()){
            case "+" : res = calc.getNum1() + calc.getNum2();
            case "-" : res = calc.getNum1() - calc.getNum2();
            case "*" : res = calc.getNum1() * calc.getNum2();
            case "/" : res = calc.getNum1() / calc.getNum2();
            default: res = 0;
        }
        return String.format("%d %s %d = %d",calc.getNum1(),
                calc.getOpcode(),calc.getNum2(),res);
    }

    @Override
    public String getGoogle(GoogleDTO google) {
        return String.format("검색 결과는 ' %s ' 입니다.", google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format("########## %s ######## \n" +
                        " *  이름: %s \n" +
                        " *  > 국어: %d점 \n" +
                        " *  > 영어: %d점 \n" +
                        " *  > 수학: %d점 \n" +
                        " *  총점: %d점 \n" +
                        " *  평균(정수): %d점 \n" +
                        " *  합격여부: %s \n" +
                        " ########################",
                grade.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(),
                grade.getMath(),total, avg, pass);
    }

    @Override
    public String getLogin(UserDTO login) {
        return (login.getPw().equals(UserDTO.PASSWORD)) ? String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",login.getId(), login.getPw())
                : String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", login.getId(), login.getPw());
    }
}
