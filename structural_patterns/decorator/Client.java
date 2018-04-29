public class Client {

  public static void main(String [] args) {
    Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

    System.out.print("Ingredients: " + basicPizza.getDescription() + "\n");
    System.out.print("Total cost: " + basicPizza.getCost() + "\n");
  }

}
