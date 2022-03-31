package zadanie;

public class Procesor extends Dekorator {
    private String model;
    private double price;

    public Procesor(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z Procesorem " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }

}
