public class ShapeFactory extends AbstractFactory {

  public Shape getShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("Circle")) {
      return new Circle();
    }
    else if (shapeType.equalsIgnoreCase("Square")) {
      return new Square();
    }
    else if (shapeType.equalsIgnoreCase("Rectangle")) {
      return new Rectangle();
    }
    else {
      return null;
    }
  }

  public Colour getColour(String colour) {
    return null;
  }

}
