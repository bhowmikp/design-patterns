public class Client {

  public static void main (String[] args){
    Sheep firstSheep = new Sheep();

    // creates absolute copy of the first sheep - fields, methods, everything
    // stores in different location
    Sheep clonedSheep = (Sheep) firstSheep.makeCopy();

    System.out.println(firstSheep);
    System.out.println(clonedSheep);

    // different locations in memory
    System.out.println("First sheep location: " + System.identityHashCode(firstSheep));
    System.out.println("Cloned sheep location: " + System.identityHashCode(clonedSheep));


  }

}
