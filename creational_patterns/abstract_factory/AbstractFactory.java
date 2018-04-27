public abstract class AbstractFactory {

  abstract Shape getShape(String shape);

  abstract Colour getColour(String colour);

  // since static it can be used before instanse of class created
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("Shape")) {
      return new ShapeFactory();
    }
    else if (choice.equalsIgnoreCase("Colour")) {
      return new ColourFactory();
    }
    else {
      return null;
    }
  }

}
