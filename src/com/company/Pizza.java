package com.company;

public class Pizza {

    private int pris;
    private int nummer;
    private int tid;
    private String note;
    private String name;

    public Pizza(int nummer, int pris, int tid, String note, String name){
        this.pris = pris;
        this.nummer = nummer;
        this.tid = tid;
        this.note = note;
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

    public int getTid() {
        return tid;
    }

    public String getNote() {
        return note;
    }
}



