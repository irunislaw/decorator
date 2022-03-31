package zadanie;

public class PamiecRAM extends Dekorator {
    private String model;
    private double price;

    public PamiecRAM(String nazwa, double cena, Komputer komputer) {
        super(komputer);
        this.model = nazwa;
        this.price = cena;
    }

    public String decorate() {
        return super.decorate() + " z Pamiecia ram " + this.model + " za " + price + " zl";
    }

    public double Price() {
        return super.price() + price;
    }
}
