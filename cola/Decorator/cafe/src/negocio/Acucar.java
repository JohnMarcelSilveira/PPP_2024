package negocio;

public class Acucar extends CondimentDecorator {

    public Acucar(Beverage beverage) {
        super();
        super.component = beverage;
    }

    @Override

    public String getDescription() {
        return super.component.getDescription() + "com açucar";
    }

    @Override
    public double cost() {
        return super.component.cost() + 1.0;
    }

}
