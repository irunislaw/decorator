package zadanie;

public class Zasilacz extends Dekorator {
    private String model;
    private double price;

    public Zasilacz(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z zasilaczem " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }
}
