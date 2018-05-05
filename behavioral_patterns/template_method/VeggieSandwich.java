public class VeggieSandwich extends Sandwich {

  public void addMeat() {}

  public void addCheese() {
    System.out.println("Adding Cheese");
  }

  public void addVegetables() {
    System.out.println("Adding Vegetables");
  }

  public void addCondiments() {}

  // modify hook
  boolean customerWantsMeat() { return false; }
  boolean customerWantsCondiments() { return false; }

}
