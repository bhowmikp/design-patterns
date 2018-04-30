public class FundsCheck {

  private double cashInAccount = 1000.00;

  public double getCashInAccount() {
    return cashInAccount;
  }

  public void decreaseCashInAccount(double cashWithdrawn) {
    cashInAccount -= cashWithdrawn;
  }

  public void increaseCashInAccount(double cashWithdrawn) {
    cashInAccount += cashWithdrawn;
  }

  public boolean haveEnoughMoney(double cashToWithdraw) {

    if (cashToWithdraw > getCashInAccount()) {
      System.out.println("Not enough money in account");
      System.out.println("Current Balance: " + getCashInAccount());

      return false;
    }
    else {
      decreaseCashInAccount(cashToWithdraw);
      System.out.println("Withdraw Complete. Current Balance is " + getCashInAccount());

      return true;
    }
  }

  public void makeDeposit(double cashToDeposit) {
    increaseCashInAccount(cashToDeposit);

    System.out.println("Deposit Complete. Current Balance is " + getCashInAccount());
  }

}
