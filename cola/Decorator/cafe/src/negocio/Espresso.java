package negocio;

public class Espresso extends Beverage {

    public Espresso() {
        super();
        super.description = "Espresso\n";
    }

    @Override
    public double cost() {
        return 1.0;
    }

}
