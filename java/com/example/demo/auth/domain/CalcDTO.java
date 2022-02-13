package com.example.demo.auth.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 * 2022-01-26   최민서      if 절 추가, 4칙연산 가능하도록 개선
 */
public class CalcDTO {
    public static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1(){

        return num1;
    }

    public void setNum1(int num1){

        this.num1 = num1;
    }

    public String getOpcode(){

        return opcode;
    }

    public void setOpcode(String opcode){

        this.opcode = opcode;
    }

    public int getNum2() {

        return num2;
    }

    public void setNum2(int num2){

        this.num2 = num2;
    }

}
