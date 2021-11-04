package com.company;

import java.util.ArrayList;
import java.util.Random;


public class OrdreHandler {
    private ArrayList<Ordre> KØ = new ArrayList<>();
    private ArrayList<Ordre> Arkiv = new ArrayList<>();
    private int konto = 0;
    private Random random = new Random();

    public void hvisKØ() {
        for (int i = 0; i < KØ.size(); i++) {
            System.out.println("OdreID: " + KØ.get(i).getOdreID() + "\nPizzaID: " + KØ.get(i).getPizzaID() + "\nAfleveringstid: " + KØ.get(i).getafleveringsTid() + "\nNote: " + KØ.get(i).getNote() + "\n");
        }
    }


    public void tilføjOdre(int PizzaID, int afleveringTid, String note){
        String OdreID = "pizza"+PizzaID+" "+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        Ordre odre = new Ordre(PizzaID, afleveringTid, OdreID, note);
        odre.setPris(PizzaID);
        odre.setNavn(PizzaID);
        KØ.add(odre);
        System.out.println(OdreID+" er nu tilføjet\n" +
                            "PizzaID: "+PizzaID+"\n" +
                            "Afleveringstid: "+afleveringTid+"\n" +
                            "Pizza navn: "+odre.getNavn()+"\nNote: "+note);
    }



    public void sælgPizza(String OdreID){
        for (int i=0; i < KØ.size(); i++){
            if (KØ.get(i).getOdreID().equals(OdreID))
                konto = konto + KØ.get(i).getPris();
            Arkiv.add(KØ.get(i));
            KØ.remove(i);
        }

    }
    public void sletPizza(String OdreID){
        for (int i=0; i < KØ.size(); i++){
            if (KØ.get(i).getOdreID().equals(OdreID))
                KØ.remove(i);
        }

    }

    public int getKonto() {
        return konto;
    }
}
