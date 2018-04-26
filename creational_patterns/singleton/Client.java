public class Client {

  public static void main(String [] args){

    Singleton firstInstance = Singleton.getInstance();
    Singleton secondInstance = Singleton.getInstance();

    // The memory locations of both instances are the same
    System.out.println("First instance hashcode: " + System.identityHashCode(firstInstance));
    System.out.println("Second instance hashcode: " + System.identityHashCode(secondInstance));

  }

}
