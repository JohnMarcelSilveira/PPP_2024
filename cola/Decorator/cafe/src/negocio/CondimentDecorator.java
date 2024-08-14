package negocio;

public abstract class CondimentDecorator extends Beverage{

  protected Beverage component;
  
  


@Override
public String getDescription() {
    return component.getDescription();
}
  
    
}
