package zadanie;

public class Plytaglowna extends Dekorator {
    private String model;
    private double price;

    public Plytaglowna(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z plyta glowna " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }
}