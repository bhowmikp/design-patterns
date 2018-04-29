public class TomatoSauce extends ToppingDecorator {

  public TomatoSauce(Pizza pizza){
    super(pizza);

    System.out.print("Adding Sauce");
  }

  public String getDescription() {
    return pizza.getDescription() + ", TomatoSauce";
  }

  public double getCost() {
    return pizza.getCost() + 0.35;
  }

}
