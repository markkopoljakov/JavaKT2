package Burger;

import java.util.ArrayList;

// Abstraktsioon
public class TavaBurger {

    // Kapseldus
    private String name;
    private double price;
    private ArrayList<String> lisandid = new ArrayList<String>();

    public TavaBurger(String name) {
        this.name = name;
        this.price = 4.20;
    }

    public void telliBurger(Lisandid lisandid) {
        for (int i = 0; i < lisandid.getLisandAmount(); i++) {
            // Kompositsioon
            this.lisandid.add(lisandid.getLisandid().get(i));
        }
        this.price += lisandid.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.name + " hinnaga " + this.price + ". Lisandid: " + this.lisandid;
    }
}
