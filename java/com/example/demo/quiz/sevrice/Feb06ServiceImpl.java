package com.example.demo.quiz.sevrice;

/**
 * packageName: com.example.demo.service
 * fileName   : quizService
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(String[] oneNames) {
        String s = "";
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        for (int i = 0; i < oneNames.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += oneNames[i] + "\t";
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] oneNames) {
        String s = "";
        System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
        for (int i = 0; i < oneNames.length; i++) {
            if (oneNames[i].equals("김윤섭")) {
                for (int j = 0; j < 4; i++) {
                    s += oneNames[i + j * 5];
                }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] oneNames) {
        String s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        for (int i = 0; i < oneNames.length; i++) {
            if (oneNames[i].equals("Queue")) {
                s += oneNames[i] + "를 담당한 사람: " + oneNames[i % 5];
            }
            if (i == 17) {
                break;
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] oneNames) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        String s = "";
        int[] countArr = new int[5];
        int[] resArr = new int[5];
        for (int i = 5; i < oneNames.length; i++){
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j){
                    countArr[j]++;
                }
                resArr = countArr;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(oneNames[i] + " (" + countArr[i] + ")\n");
        }
    }
}
