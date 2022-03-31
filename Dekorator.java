package zadanie;

public class Dekorator extends Komputer {
    private Komputer komputer;

    public Dekorator(Komputer komputer) {
        this.komputer = komputer;
    }

    @Override
    public String decorate() {
        return komputer.decorate();
    }

    public double price() {
        return komputer.price;
    };

}
