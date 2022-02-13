package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm
 * fileName   : ArrayExam
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class ArrayExam {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                    "Sort", "Stack", "Hash", "Heap", "Greedy",
                    "Binary Search", "Queue", "Graph", "DFS", "BFS",
                    "Brute Force", "DP"};
            while (true){
                System.out.println("문제를 선택하세요.");
                String menu = "0. 종료 1.퀴즈1 2.퀴즈2 3.퀴즈3 4.퀴즈4";
                switch (scanner.next()) {
                    case "0":
                        System.out.println("시스템 종료"); return;
                    case "1":
                        quiz1(arr); break;
                    case "2" :
                        quiz2(arr); break;
                    case "3" :
                        quiz3(arr); break;
                    case "4" :
                        quiz4(arr); break;
                    default:
                        System.out.println("잘못된 번호 입니다.");
                }

            }

        }

        private static void quiz4(String[] arr) {
            System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
            String s = "";
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int[] countArr = new int[5];
            for (int i = 0; i<5; i++){
                if (arr[i].equals(arr[5])){
                    count0++;
                }
                if (arr[i].equals(arr[6])){
                    count1++;
                }
                if (arr[i].equals(arr[7])){
                    count2++;
                }
                if (arr[i].equals(arr[8])){
                    count3++;
                }
                if (arr[i].equals(arr[9])){
                    count4++;
                }
            }
            System.out.println(arr[0]+"의 카운트는 " +count0);
            System.out.println(arr[1]+"의 카운트는 " +count1);
            System.out.println(arr[2]+"의 카운트는 " +count2);
            System.out.println(arr[3]+"의 카운트는 " +count3);
            System.out.println(arr[4]+"의 카운트는 " +count4);
        }

        private static void quiz3(String[] arr) {
            System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
            String s = "";
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals("Queue")){
                    s += arr[i] + "를 담당한 사람: " + arr[i % 5];
                }
            }
            System.out.println(s);
        }

        private static void quiz2(String[] arr) {
            System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
            String s = "";
            for (int i = 0; i < arr.length; i++)
                if (arr[i].equals("김윤섭")){
                    for (int j = 0; j < 4; j++){
                        s += arr[i + j * 5] + " ";
                    }
                }
            System.out.println(s);
        }

        private static void quiz1(String[] arr) {
            System.out.println("Q1. 팀별 과제를 출력하세요.");
            String s = "";
            for (int i = 0; i < arr.length; i++){
                if (i % 5 == 0){
                    s += "\n";
                }
                s += arr[i]+ "\t";
            }
            System.out.println(s);
        }
    }

