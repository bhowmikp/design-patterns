public abstract class Sandwich {

  final void makeSandwich() {

    cutBun();

    if (customerWantsMeat()) {
      addMeat();
    }

    if (customerWantsCheese()) {
      addCheese();
    }

    if (customerWantsVegetables()) {
      addVegetables();
    }

    if (customerWantsCondiments()) {
      addCondiments();
    }

    wrapTheSandwich();

  }

  public void cutBun() {
    System.out.println("The Sandwich is Cut");
  }

  public void wrapTheSandwich() {
    System.out.println("Wrap the Sandwich");
  }

  abstract void addMeat();
  abstract void addCheese();
  abstract void addVegetables();
  abstract void addCondiments();

  // hook
  // set true by default but allows subclasses to override it
  boolean customerWantsMeat() { return true; }
  boolean customerWantsCheese() { return true; }
  boolean customerWantsVegetables() { return true; }
  boolean customerWantsCondiments() { return true; }

}
