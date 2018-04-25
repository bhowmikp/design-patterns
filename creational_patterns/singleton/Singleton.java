public class Singleton {

  // holds the only instance of singleton. This is the access point
  // static because it needs to be available on a global basis
  private static Singleton firstInstance = null;

  private String greeting;

  // private to make sure only one instance and no one can create
  // their own instance
  private Singleton(){
    this.greeting = "Hello";
  }

  /**
  * Creates instance if no instance exists
  * If it exists returns the instance.
  *
  * Returns singleton instance
  */
  public static Singleton getInstance(){

    if (firstInstance == null){
       firstInstance = new Singleton();
    }

    return firstInstance;
  }

  /**
  * Get contents of class
  */
  public String toString(){
    return ("Greeting is: " + greeting);
  }

}
