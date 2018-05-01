public class MultNumbers implements Chain {

  private Chain nextChain;

  public void setNextChain(Chain nextChain) {
    this.nextChain = nextChain;
  }

  public void calculate(Numbers request) {
    if (request.getCalcWanted() == "mult") {
      System.out.println(request.getNumber1() + " * " + request.getNumber2() +
                          " = " + (request.getNumber1() * request.getNumber2()));
    }
    else {
      nextChain.calculate(request);
    }
  }

}
