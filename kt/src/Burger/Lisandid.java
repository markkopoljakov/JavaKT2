package Burger;

import java.util.ArrayList;

    // Abstraktsioon
    public class Lisandid {


    // Polümorfism esimene pool
    public Lisandid(ArrayList<String> lisandid) {
        for (int i = 0; i < lisandid.size(); i++) {
            this.price += 0.2;
            this.lisandid.add(lisandid.get(i));
        }
    }
        // Kapseldus
        private ArrayList<String> lisandid = new ArrayList<String>();
        private double price;

    // Polümorfism 2
    public Lisandid() {
        this.price = 0;
    }

    public int getLisandAmount() {
        return lisandid.size();
    }

    public ArrayList<String> getLisandid() {
        return lisandid;
    }

    public double getPrice() {
        return price;
    }
}
