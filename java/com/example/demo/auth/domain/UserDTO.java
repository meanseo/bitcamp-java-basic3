package com.example.demo.auth.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 아이디, 비번, 이름을 받아서 로그인하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 * 2022-01-26   최민서      if절 추가
 * 2022-01-26   최민서      switch절 추가
 * 2022-01-26   최민서      3항 연산식 사용
 */
public class UserDTO {
    public static String LOGIN_TITLE = " * Login App * ";

    private final static UserDTO userDTO = new UserDTO();
    private UserDTO(){}
    public static UserDTO getInstance(){return userDTO;}

    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPw(){
        return pw;
    }

    public void setPw(String pw){
        this.pw = pw;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
