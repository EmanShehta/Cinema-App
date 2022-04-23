package com.example.cinema;

import androidx.arch.core.util.Function;

public class designfilm {

    private String title;
    private  String rating,location;
    private int img1 ;
    private float ratebar ;

    public designfilm(String title, String rating,String location , int img1 ,float ratebar) {
        this.title = title;
        this.rating = rating;
        this.location=location;
        this.img1 = img1;
        this.ratebar=ratebar;
      /*  this.p1 =p1;
        this.p2=p2;
        this.p3=p3;*/
    }
    /*public Function getBtn1() {
        return btn;
    }
    public void setBtn1(Function btn1) {
        this.btn = btn1;
    }*/
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRating() {
        return rating;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getImg1() {
        return img1;
    }
    public void setImg(int img1) {
        this.img1 = img1;
    }
    public float getRatebar() {
        return ratebar;
    }
    public void setRatebar(float ratebar) {
        this.ratebar = ratebar;
    }

    /*

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }*/
}

