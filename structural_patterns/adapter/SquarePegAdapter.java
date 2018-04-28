// takes old shape and converts to new shape

public class SquarePegAdapter {

  private SquarePeg squarePeg;

  public SquarePegAdapter(double w) {
    this.squarePeg = new SquarePeg(w);
  }

  public void makeFit(RoundHole roundHole) {
    double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);

    System.out.println("The old width was: " + squarePeg.getWidth());

    if (amount > 0){
      squarePeg.setWidth(squarePeg.getWidth() - amount);
      System.out.println("The new (adapted) width is: " + squarePeg.getWidth());
    }
  }

}
