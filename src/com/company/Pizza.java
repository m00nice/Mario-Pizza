package com.company;

public class Pizza {

    private int pris;
    private int nummer;
    private String name;

    public Pizza(int nummer, int pris, String name){
        this.pris = pris;
        this.nummer = nummer;
        this.name = name;
        }

    public String getName() {
        return name;
    }

    public int getPris() {
        return pris;
    }

    public int getNummer() {
        return nummer;
    }
}



