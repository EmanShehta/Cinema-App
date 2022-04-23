package com.example.cinema;
public class film {

    private String title;
    private  String description,btn1;//p1,p2,p3;
    private int img ;

    public film(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
      /*  this.p1 =p1;
        this.p2=p2;
        this.p3=p3;*/
    }
    public String getBtn1() {
        return btn1;
    }

    public void setBtn1(String btn1) {
        this.btn1 = btn1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

 /*   public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

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

