package com.example.demo.auth.controller;

import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.domain.UserDTO;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : 최민서
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     최민서        최초 생성
 */

public class MemberController {
    public void execute(Scanner scanner) {
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        MemberService service = new MemberServiceImpl();

        while (true){
            System.out.println("메뉴 선택");
            String menu = "0.EXIT 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;

                case "1": res = "BMI";
                    System.out.println(BmiDTO.TITLE + "\n 이름, 키, 몸무게");
                    BmiDTO bmi =BmiDTO.getInstance();
                    bmi.setName(scanner.next());
                    bmi.setHei(scanner.nextDouble());
                    bmi.setWei(scanner.nextDouble());
                    res = service.getBmi(bmi);
                break;

                case "2": res = "CAlC";
                    System.out.println(CalcDTO.CALC_TITLE + "\n 숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.getCalc(calc);
                break;

                case "3": res = "GOOGLE";
                    System.out.println(GoogleDTO.WEB_TITLE + "\n 검색어를 입력하세요.");
                    google.setSearch(scanner.next());
                    res = service.getGoogle(google);
                break;

                case "4": res = "GRADE";
                    System.out.println(GradeDTO.GRADE_TITLE + "\n 이름, 국어, 영어, 수학 입력");
                    GradeDTO grade = GradeDTO.getInstance();
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                        res = service.getGrade(grade);
                break;

                case "5": res = "LOGIN";
                    System.out.println(UserDTO.LOGIN_TITLE + "\n id, pw, name");
                    UserDTO u = UserDTO.getInstance();
                    u.setName(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = service.getLogin(u);
                break;

                default: res = "없는 메뉴 입니다.";
                break;
            }
            System.out.println(res);
        }
    }
}
