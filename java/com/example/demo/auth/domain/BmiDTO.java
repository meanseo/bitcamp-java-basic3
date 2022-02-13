package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : bmi 값을 받아 결과를 리턴하는 앱
 *  클래스 변수 TITLE
 *  파라미터 name, height, kg
 *  인스턴스 (this.)name, (this.)height, (this.)kg
 *  로컬 변수 res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class BmiDTO extends Object{
    public static String TITLE = "BMI";

    private final static BmiDTO bmiDTO = new BmiDTO();
    private BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    private String name;
    private double hei;
    private double wei;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHei() {
        return hei;
    }

    public void setHei(double hei) {
        this.hei = hei;
    }

    public double getWei() {
        return wei;
    }

    public void setWei(double wei) {
        this.wei = wei;
    }
}
