package com.company;

import java.util.ArrayList;

public class Produktion {
    private ArrayList<Pizza> kø = new ArrayList<>();
    private ArrayList<Pizza> Arkiv = new ArrayList<>();
    private int MONEY = 0;

    public void addPizza(int nummer, int tid, String note, String name){
        if(nummer >= 1 && nummer <= 30 ){
        if(nummer == 1){
            Pizza Vesuvio = new Pizza(1,57,tid,note,name);
            kø.add(Vesuvio);
        }
        if(nummer == 2){
            Pizza Amerikaner = new Pizza(2,53,tid,note,name);
        }
        if(nummer == 3){
            Pizza Cacciatore = new Pizza(3,57,tid,note,name);
        }
        if(nummer == 4){
            Pizza Cabonara = new Pizza(4,63,tid,note,name);
        }
        if(nummer == 5){
            Pizza Dennis = new Pizza(5,65,tid,note,name);
        }
        if(nummer == 6){
            Pizza Bertil = new Pizza(6,57,tid,note,name);
        }
        if(nummer == 7){
            Pizza Silvia = new Pizza(7,61,tid,note,name);
        }
        if(nummer == 8){
            Pizza Victoria = new Pizza(8,61,tid,note,name);
        }
        if(nummer == 9){
            Pizza Toronfo = new Pizza(9,61,tid,note,name);
        }
        if(nummer == 10){
            Pizza Capricciosa = new Pizza(10,61,tid,note,name);
        }
        if(nummer == 11){
            Pizza Hawai = new Pizza(11,61,tid,note,name);
        }
        if(nummer == 12){
            Pizza Le_Blissola = new Pizza(12,61,tid,note,name);
        }
        if(nummer == 13){
            Pizza Venezia = new Pizza(13,61,tid,note,name);
        }
        if(nummer == 14){
            Pizza Mafia = new Pizza(14,61,tid,note,name);
        }
        if(nummer == 15){
            Pizza Salat_Pizza = new Pizza(15,61,tid,note,name);
        }
        if(nummer == 16){
            Pizza Marco_Polo = new Pizza(16,61,tid,note,name);
        }
        if(nummer == 17){
            Pizza Charlie = new Pizza(17,65,tid,note,name);
        }
        if(nummer == 18){
            Pizza Mexicano = new Pizza(18,63,tid,note,name);
        }
        if(nummer == 19){
            Pizza Roma = new Pizza(19,61,tid,note,name);
        }
        if(nummer == 20){
            Pizza Neptun = new Pizza(20,63,tid,note,name);
        }
        if(nummer == 21){
            Pizza Pratt = new Pizza(21,63,tid,note,name);
        }
        if(nummer == 22){
            Pizza Chicken = new Pizza(22,61,tid,note,name);
        }
        if(nummer == 23){
            Pizza Margherita = new Pizza(23,53,tid,note,name);
        }
        if(nummer == 24){
            Pizza Yankee = new Pizza(24,61,tid,note,name);
        }
        if(nummer == 25){
            Pizza Sicily = new Pizza(25,61,tid,note,name);
        }
        if(nummer == 26){
            Pizza DK = new Pizza(26,61,tid,note,name);
        }
        if(nummer == 27){
            Pizza Vegetariana = new Pizza(27,61,tid,note,name);
        }
        if(nummer == 28){
            Pizza Bodil = new Pizza(28,57,tid,note,name);
        }
        if(nummer == 29){
            Pizza Bowser = new Pizza(29,63,tid,note,name);
        }
        if(nummer == 30){
            Pizza Mamma_Mia = new Pizza(30,69,tid,note,name);


    }}else {
            System.out.println("Denne pizza eksiterer ikke...");
        }
}
    public void hvisKø() {
        for (int i = 0; i < kø.size(); i++) {
            System.out.println("Nummer: " + kø.get(i).getNummer() + "\nAfleveringstid: " + kø.get(i).getTid() + "\nNote: " + kø.get(i).getNote() + "\nNavn: " + kø.get(i).getName() + "\n");
        }
    }


    public void sælgPizza(String pizzaNavn){
        for (int i=0; i < kø.size(); i++){
            if (kø.get(i).getName().equals(pizzaNavn))
            MONEY = MONEY + kø.get(i).getPris();
            Arkiv.add(kø.get(i));
            kø.remove(i);
        }

    }





}
