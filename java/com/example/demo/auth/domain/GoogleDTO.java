package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleApp.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : 입력내용을 받아 결과를 리턴하는 앱
 * variable   : [클래스 변수] WEB_TITLE
 *              [인스턴스 변수] (this.)search
 *              [파라미터] search
 *              [로컬 변수] res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class GoogleDTO {
    public static String WEB_TITLE = " Google ";
    private String search;

    public String getSearch(){

        return search;
    }

    public void setSearch(String search){

        this.search = search;
    }

}
