public class Client {

  public static void main(String [] args) {

    Chain chainCalc1 = new AddNumbers();
    Chain chainCalc2 = new SubtractNumbers();
    Chain chainCalc3 = new MultNumbers();
    Chain chainCalc4 = new DivideNumbers();

    chainCalc1.setNextChain(chainCalc2);
    chainCalc2.setNextChain(chainCalc3);
    chainCalc3.setNextChain(chainCalc4);

    Numbers request = new Numbers(4, 2, "mult");

    chainCalc1.calculate(request);

  }

}
