package com.company;

public class Main {

    public static void main(String[] args) {
        Pudel pudel=new Pudel(4,"Dima",80,"pudel");
        Ovcharka ovcharka=new Ovcharka(10,"Sam",160,"ovcharka");
        Taksa taksa=new Taksa(8,"Sosiska",150,"taksa");
        System.out.println(pudel.toString());
        System.out.println(ovcharka.toString());
        System.out.println(taksa.toString());
    }
}
