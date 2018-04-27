public class ColourFactory extends AbstractFactory {

  public Shape getShape(String shape) {
    return null;
  }

  public Colour getColour(String colourType) {
    if (colourType.equalsIgnoreCase("Blue")) {
      return new Blue();
    }
    else if (colourType.equalsIgnoreCase("Green")) {
      return new Green();
    }
    else if (colourType.equalsIgnoreCase("Red")) {
      return new Red();
    }
    else {
      return null;
    }
  }

}
