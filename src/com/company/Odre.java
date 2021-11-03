package com.company;

public class Odre {

    private int PizzaID;
    private String OdreID;
    private int afleveringsTid;
    private String note;
    private int pris;

    public Odre(int PizzaID, int afleveringsTid, String OdreID, String note){
        this.PizzaID = PizzaID;
        this.afleveringsTid = afleveringsTid;
        this.OdreID = OdreID;
        this.note = note;
    }


    public String getOdreID() {
        return OdreID;
    }

    public int getPizzaID() {
        return PizzaID;
    }

    public String getNote() {
        return note;
    }

    public int getafleveringsTid() {
        return afleveringsTid;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        if(PizzaID == 1){this.pris = 57;}
        if(PizzaID == 2){this.pris = 53;}
        if(PizzaID == 3){this.pris = 57;}
        if(PizzaID == 4){this.pris = 63;}
        if(PizzaID == 5){this.pris = 65;}
        if(PizzaID == 6){this.pris = 57;}
        if(PizzaID == 7){this.pris = 61;}
        if(PizzaID == 8){this.pris = 61;}
        if(PizzaID == 9){this.pris = 61;}
        if(PizzaID == 10){this.pris = 61;}
        if(PizzaID == 11){this.pris = 61;}
        if(PizzaID == 12){this.pris = 61;}
        if(PizzaID == 13){this.pris = 61;}
        if(PizzaID == 14){this.pris = 61;}
        if(PizzaID == 15){this.pris = 61;}
        if(PizzaID == 16){this.pris = 61;}
        if(PizzaID == 17){this.pris = 65;}
        if(PizzaID == 18){this.pris = 63;}
        if(PizzaID == 19){this.pris = 61;}
        if(PizzaID == 20){this.pris = 63;}
        if(PizzaID == 21){this.pris = 63;}
        if(PizzaID == 22){this.pris = 61;}
        if(PizzaID == 23){this.pris = 53;}
        if(PizzaID == 24){this.pris = 61;}
        if(PizzaID == 25){this.pris = 61;}
        if(PizzaID == 26){this.pris = 61;}
        if(PizzaID == 27){this.pris = 61;}
        if(PizzaID == 28){this.pris = 57;}
        if(PizzaID == 29){this.pris = 63;}
        if(PizzaID == 30){this.pris = 69;}

    }
}
