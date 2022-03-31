package zadanie;

public class KartaGraficzna extends Dekorator {
    private String model;
    private double price;

    public KartaGraficzna(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z karta graficzna " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }
}
