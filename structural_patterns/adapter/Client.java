public class Client {

  public static void main (String [] args){
    RoundHole roundHole = new RoundHole(5);

    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(8);
    squarePegAdapter.makeFit(roundHole);
  }

}
