public class Sheep implements Animal {

  public Sheep(){
    System.out.println("Sheep is Made");
  }

  public Animal makeCopy(){

    System.out.println("Sheep is being made");

    Sheep sheepObject = null;

    // Sheep is being cloned
    try{
        sheepObject = (Sheep) super.clone();
    }
    // triggered for object that does not have extends cloneable
    catch (CloneNotSupportedException e){
      e.printStackTrace();
    }

    return sheepObject;
  }

  public String toString(){

    return "This is a Sheep";

  }

}
