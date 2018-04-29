public class Mozzarella extends ToppingDecorator {

  public Mozzarella(Pizza pizza){
    super(pizza);

    System.out.print("Adding Mozzarella");
  }

  public String getDescription() {
    return pizza.getDescription() + ", Mozzarella";
  }

  public double getCost() {
    return pizza.getCost() + 0.50;
  }

}
