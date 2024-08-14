package negocio;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super();
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.0;
    }

}