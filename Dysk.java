package zadanie;

public class Dysk extends Dekorator {

    private String model;
    private double price;

    public Dysk(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z Dyskiem " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }

}
