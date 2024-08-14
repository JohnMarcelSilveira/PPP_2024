package negocio;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super();
        super.component = beverage;
    }

    @Override

    public String getDescription() {
        return super.component.getDescription() + "\n Leite";
    }

    @Override
    public double cost() {
        return super.component.cost() + 3.0;
    }

}
