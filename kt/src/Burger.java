import java.util.ArrayList;

public class Burger {
    private String nimetus;
    private String lihaTüüp;
    private String saiaTüüp;
    private double hind;
    private double lisadeHind;

    public Burger(String nimi, String liha, String sai, Lisand lisand) {
        this.nimetus = nimi;
        this.lihaTüüp = liha;
        this.saiaTüüp = sai;
        this.hind = 4.69;
        this.lisadeHind += lisand.getHind();
    }

    public Burger(String nimi, String liha, Lisand lisand) {
        this.nimetus = nimi;
        this.lihaTüüp = liha;
        this.saiaTüüp = "Tera leib";
        this.hind = 4.20;
        this.lisadeHind += lisand.getHind();
    }

    public double koostaBurger(Burger burger) {
        this.hind += this.lisadeHind;
        System.out.println("Teie tellimus kokku: ");
        System.out.println(hind);
        return hind;
    }
}
