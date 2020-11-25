package Burger;

import java.util.ArrayList;

// Abstraktsioon
// Pärilus
public class LuxBurger extends TavaBurger {

    // Kapseldus
    private String name;
    private String bread;
    private double price;
    private ArrayList<String> lisandid = new ArrayList<String>();

    public LuxBurger(String name) {
        // Pärilus
        super(name);
        this.name = super.getName();
        this.bread = "Eriti Hea sai";
        this.price = super.getPrice() + 0.60;
    }

    public void telliLuxBurger(Lisandid lisandid) {
        for (int i = 0; i < lisandid.getLisandAmount(); i++) {
            // Kompositsioon
            this.lisandid.add(lisandid.getLisandid().get(i));
        }
        this.price += lisandid.getPrice();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " Luksusliku saiaga, hinnaga " + this.price + ". Lisandid: " + this.lisandid;
    }
}
