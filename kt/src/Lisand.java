public class Lisand {
    private boolean lisa1;
    private boolean lisa2;
    private boolean lisa3;
    private boolean lisa4;
    private double hind;

    public Lisand(boolean lisa1, boolean lisa2, boolean lisa3, boolean lisa4) {
        this.hind = 0;
        this.lisa1=lisa1;
        this.lisa1=lisa2;
        this.lisa1=lisa3;
        this.lisa1=lisa4;
        if (this.lisa1 = true) {
            this.hind += 0.6;
        }
        if (this.lisa2 = true) {
            this.hind += 0.9;
        }
        if (this.lisa3 = true) {
            this.hind += 0.2;
        }
        if (this.lisa4 = true) {
            this.hind += 0.3;
        }
    }

    public double getHind() {
        return hind;
    }
}
