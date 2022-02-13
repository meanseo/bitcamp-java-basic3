package com.example.demo.quiz.controller;

import com.example.demo.quiz.sevrice.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController2
 * author     : 최민서
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04     최민서        최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner) {

        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true) {
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 3)2월10일");
            switch (scanner.next()) {
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    String[] oneNames = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                            "Sort", "Stack", "Hash", "Heap", "Greedy",
                            "Binary Search", "Queue", "Graph", "DFS", "BFS",
                            "Brute Force", "DP"};
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("### 팀별 과제 ###");
                            feb06Service.quiz1(oneNames);
                            break;
                        case "2":
                            System.out.println("### 팀장이 맡은 과제 ###");
                            feb06Service.quiz2(oneNames);
                            break;
                        case "3":
                            System.out.println("### 큐를 담당한 사람 ###");
                            feb06Service.quiz3(oneNames);
                            break;
                        case "4":
                            System.out.println("### 팀원별 과제 수 ###");
                            feb06Service.quiz4(oneNames);
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }
                case "2":
                    System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("### 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 주사위 ###");
                            feb07Service.getDice(scanner);
                            break;
                        case "2":
                            System.out.println("### 가위바위보 ###");
                            feb07Service.getRps(scanner);
                            break;
                        case "3":
                            System.out.println("### 소수 구하기 ###");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("### 윤년/평년 ###");
                            feb07Service.getLeapYear(scanner);
                            break;
                        case "5":
                            System.out.println("### 임의숫자 맞추기 ###");
                            feb07Service.getGuessNumber(scanner);
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("[소메뉴]\n 0.Exit \n1.퀵정렬 \n2.야구 \n3.좌석예약\n 4.은행 입출금\n 5.구구단");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("### 종료 ###");
                            return;
                        case "1":
                            int[] arr = new int[10];

                            for (int i=0; i<arr.length; i++) {
                                arr[i]= (int)(Math.random()*100)+1;
                                for (int j=0; j<i; j++) {
                                    if (arr[i]==arr[j]) {
                                        i--; break;
                                    }
                                }
                            }
                            feb10Service.quickSort(arr,0,arr.length-1);
                            feb10Service.res(arr);
                        case "2":

                    }

            }
        }
    }
}
