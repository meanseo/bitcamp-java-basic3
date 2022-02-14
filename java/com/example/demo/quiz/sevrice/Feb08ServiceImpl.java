package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb08ServiceImpl
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {
    /**
     *    author     : 김윤섭
     1) 서로 다른 6개의 정수를 저장할 배열을 선언한다
     * 2) 1~45 사이의 임의의 정수를 만든다.
     * 3) 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다
     * 4) 같은 방법으로 서로 다른 6개의 수가 배열에 저장될 때까지 반복한다.
     * 로또 i번째 칸이랑 i보다 작은 칸들의 인덱스랑 다 비교해서 그 인덱스들이 서로 같지 않을 때까지 반복한다.
     * 인덱스가 같은게 나오면 i 반복수를 줄이고, 해당 검열 반복문을 종료한다.
     */
    @Override
    public void lotto(Scanner scanner) {
        int lotto[] = new int[6];
        System.out.println("로또 당첨 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;

                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }
    }

    @Override
    public void baseball(Scanner scanner) {

    }

    /** author: 김승현
     * des: 스크린 자리를 표현하기 위하여 행값 7 열값 7을 갖는 2중 배열 seat를 선언했다.
     * 이후에 행표시를 위하여 1차원 배열 list를 선언하고 값을 주었다.
     * 행이름과 빈좌석 표현을 위하여 for 문을 사용하였다.
     * i값은 0 부터 7보다 작은 수를 가지며 점점커지며 그 안에서 J값은 0부터 7보다 작은 수를 가지며실행된다.
     * i와 j는 각각 seat [i] [j]에 입력되며 "ㅁ" 으로 표시된다.
     * 참고: https://zodlab.tistory.com/16
     */
    @Override
    public void booking(Scanner scanner) {
        String[][] seat = new String[7][7];
        String[] list = {"A", "B", "C", "D", "E", "F", "G"};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                seat[i][j] = " □ ";
            }
            while (true) {
                System.out.println("\n원하시는 메뉴번호를 입력 해주세요.\n0.Exit 1.예약조회 2.예약신청 3.예약취소");
                int select = scanner.nextInt();
                switch (select) {
                    case 0:
                        System.out.println("종료");
                        return;
                    case 1: {
                        for (i = 0; i < 7; i++) {
                            System.out.print("\n" + list[i] + " ");
                            for (int j = 0; j < 7; j++) {
                                System.out.print(seat[i][j]);
                            }
                        }
                    }
                    break;
            /* 메뉴번호를 출력후에 번호를 받고 스위치문을 사용하여 받은 번호에 따라 실행되는 구문을 만들었다.
            0번을 입력하면 종료 출력과 함께 다시 돌아가게 된다.
            1번을 입력시 for 문이 자동한다. i 값은 0~ 6 까지 점점 커진다 .i값은 list[i]에 들어가며 A부터 G까지 출력된다
            줄을 바꿔 출력 시키기 위하여 \n을 사용하였다. J값도 0 ~6으로 점차 커진다.
         */

                    case 2:
                        System.out.println("행번호를을 입력해주세요. A(1) ~ G(7) ");
                        int row = scanner.nextInt() - 1;
                        while (row > 6) {
                            System.out.println("존재하지 않는 행입니다.");
                            return;
                        }
                        System.out.println("열번호를 입력해주세요. 1 ~ 7");
                        int col = scanner.nextInt() - 1;
                        while (col > 6) {
                            System.out.println("존재하지 않는 열입니다.");
                            return;
                        }
                        seat[row][col] = " ■ ";
                        System.out.println("예약 신청되었습니다.");
                        break;
                /*
                입력받은 값을 -1 하는 이유는 행과 열은0부터 카운트가 되기 때문이다.
                while을 사용하여 7보다 큰값을 입력 한 경우 저장된 메시지를 출력한다.
                입력받은 행값과 열값은 " ■ "로 출력된다.
                 */

                    case 3:
                        System.out.println("행번호를을 입력해주세요. A(1) ~ G(7)");
                        int row2 = scanner.nextInt() - 1;
                        while (row2 > 6) {
                            System.out.println("존재하지 않는 행입니다.");
                            return;
                        }
                        System.out.println("열번호를 입력해주세요. 1 ~ 7");
                        int col2 = scanner.nextInt() - 1;
                        while (col2 > 6) {
                            System.out.println("존재하지 않는 열입니다.");
                            return;
                        }
                        seat[row2][col2] = " □ ";
                        System.out.println("예약이 취소되었습니다.");
                        break;
                    default:
                        System.out.println("존재하지 않는 메뉴번호 입니다.");
                        break;
            /*
            케이스 2번과 같은 원리로 작동된다.
             */
                }
            }
        }
    }

    /**
     * author : sungsuhan
     * des :
     * money 디폴트 값으로 생성
     * name, pw 차례대로 입력스캐너 생성
     * while 무한 loop 생성
     * 입력값 input 입력스캐너 생성
     * switch 조건문에서 input이 0 이면 종료 출력후 return 때문에 완전 밖으로 나온다
     * input이 1이면 입금 출력 후 money 입력스캐너 생성
     * money += scanner.nextInt(); == money = money + scanner.nextInt();
     * break; 때문에 다시 메뉴로 올라감
     * input이 2이면 출금 출력 후 money 입력스캐너 생성
     * money -= scanner.nextInt(); == money = money - scanner.nextInt();
     * break; 때문에 다시 메뉴로 올라감
     * input이 3이면 앞에 출력했던 name 과 money를 불러온 후 출력
     * break; 때문에 다시 메뉴로 올라감
     * 입력값이 0,1,2,3 모두 아니면 0~3입력 출력 후 다시 메뉴로 올라감
     * <p>
     * 출처 : https://dw-forensic.tistory.com/entry/
     * 2%ED%9A%8C%EC%B0%A8-%EC%9E%90%EB%B0%94%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9C%BC%EB%A1%9C
     * -%EC%9D%80%ED%96%89%EC%9E%85%EC%B6%9C%EA%B8%88%EB%A7%8C%EB%93%A4%EA%B8%B0
     */
    @Override
    public void bank(Scanner scanner) {
        int money = 0;
        System.out.println("이름 입력");
        String name = scanner.next();
        System.out.println("계좌 비밀번호 입력");
        int pw = scanner.nextInt();
        System.out.println("계좌 인증 완료");
        while (true) {
            System.out.println("0.종료 1.입금 2.출금 3.잔고");
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("종료");
                    return;
                case 1:
                    System.out.println("입금 : ");
                    money += scanner.nextInt();
                    break;
                case 2:
                    System.out.println("출금 :");
                    money -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println(name + "님의 잔고 : " + money + "원");
                    break;
                default:
                    System.out.println("0~3 입력");
                    break;
            }
        }
    }

    /**
     * author : 최민서
     * des : 각 단이 세로로 출력 되어야 하므로 2*1 2*2 2*3 순서가 아닌
     *        2*1 3*1 4*1 5*1 순서로 출력이 되도록 생각하고 코드 짜기
     */
    @Override
    public void gugudan(Scanner scanner) {
        for (int dan = 2; dan < 10; dan += 4) { //구구단은 2단부터 시작.
            for (int i = 1; i <= 9; i++) { // 1 ~ 9 까지 곱이 나오도록 조건잡기
                for (int j = dan; j < dan + 4; j++) {
                    System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                }
                System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개가 출력된 후 엔터
            }
            System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
        }
    }
}