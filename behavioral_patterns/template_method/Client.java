public class Client {

  public static void main(String [] args) {

    System.out.println("Customer1");
    Sandwich customer1 = new ItalianSandwich();
    customer1.makeSandwich();

    System.out.println();
    
    System.out.println("Customer2");
    Sandwich customer2 = new VeggieSandwich();
    customer2.makeSandwich();

  }

}
