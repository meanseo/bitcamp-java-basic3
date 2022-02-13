package com.example.demo;

import com.example.demo.algorithm.controller.AlgoController;
import com.example.demo.auth.controller.MemberController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class  DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Scanner scanner= new Scanner(System.in);
        OopController oopController = new OopController();
        AlgoController algoController = new AlgoController();
        QuizController quizController = new QuizController();
        MemberController memberController = new MemberController();
        while (true){
            System.out.println("메뉴를 선택하세요.");
            System.out.println("0.EXIT 1.Algorithm 2.oop 3.quiz 4.auth");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT");return;
                case "1" :
                    System.out.println("algorithm");
                    algoController.execute(scanner);break;
                case "2" :
                    System.out.println("oop");
                    oopController.execute(scanner);break;
                case "3":
                    System.out.println("quiz");
                    quizController.execute(scanner);break;
                case "4":
                    System.out.println("auth");
                    memberController.execute(scanner);break;
                default:
                    System.out.println("잘못된 메뉴선택입니다.");break;
            }
        }
    }
}
