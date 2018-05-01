public class ATMMachine implements ATMData {

  private int accountNumber;
  private int cashInMachine = 2000;

  public ATMMachine(int accountNumber) {
    this.accountNumber = accountNumber;
    loadFromDisk();
  }

  public int getCashInMachine() {
    return cashInMachine;
  }

  private void loadFromDisk() {
    System.out.println("Accessing account: " + Integer.toString(accountNumber));
  }

}
