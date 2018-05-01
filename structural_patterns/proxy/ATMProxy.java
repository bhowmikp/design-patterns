public class ATMProxy implements ATMData {

  private ATMMachine atmMachine;
  private int accountNumber;

  public ATMProxy(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getCashInMachine() {
    if (atmMachine == null) {
      atmMachine = new ATMMachine(accountNumber);
    }
    return atmMachine.getCashInMachine();
  }

}
