public class BankAccountFacade {

  private int accountNumber;
  private int securityCode;

  AccountNumberCheck accountChecker;
  SecurityCodeCheck securityCodeChecker;
  FundsCheck fundChecker;

  public BankAccountFacade(int accountNumber, int securityCode) {
    this.accountNumber = accountNumber;
    this.securityCode = securityCode;

    accountChecker = new AccountNumberCheck();
    securityCodeChecker = new SecurityCodeCheck();
    fundChecker = new FundsCheck();
  }

  public int getAccountNumber() { return accountNumber; }
  public int getSecurityCode() { return securityCode; }

  public void withdrawCash(double cashToGet) {
    if (accountChecker.accountActive(getAccountNumber()) &&
     securityCodeChecker.accountActive(getSecurityCode()) &&
     fundChecker.haveEnoughMoney(cashToGet)){
      System.out.println("Transaction complete");
    }
    else {
      System.out.println("Transaction failed");
    }
  }

  public void depositCash(double cashToDeposit) {
    if (accountChecker.accountActive(getAccountNumber()) &&
     securityCodeChecker.accountActive(getSecurityCode())){
      fundChecker.makeDeposit(cashToDeposit);

      System.out.println("Transaction complete");
    }
    else {
      System.out.println("Transaction failed");
    }
  }

}
