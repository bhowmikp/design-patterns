public class Client {

  public static void main(String [] args) {
    ATMData atmMachine = new ATMProxy(1002270927);

    // loaded from disk
    System.out.println(atmMachine.getCashInMachine());

    // image not loaded from disk
    System.out.println(atmMachine.getCashInMachine());

  }

}
