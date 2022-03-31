package zadanie;

public class Obudowa extends Dekorator {
    private String model;
    private double price;

    public Obudowa(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z Obudową " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }
}
