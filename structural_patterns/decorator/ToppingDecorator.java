public abstract class ToppingDecorator implements Pizza {

  protected Pizza pizza;

  public ToppingDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription();
  }

  public double getCost() {
    return pizza.getCost();
  }

}
