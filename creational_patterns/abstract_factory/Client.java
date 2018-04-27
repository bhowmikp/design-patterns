public class Client {

  public static void main (String [] args) {

    // get shape factory
    AbstractFactory shapeFactory = AbstractFactory.getFactory("Shape");

    // create shapes
    Shape circle = shapeFactory.getShape("Circle");
    circle.draw();

    Shape square = shapeFactory.getShape("Square");
    square.draw();

    Shape rectangle = shapeFactory.getShape("Rectangle");
    rectangle.draw();


    // get colour factory
    AbstractFactory colourFactory = AbstractFactory.getFactory("Colour");

    // use colours
    Colour blue = colourFactory.getColour("Blue");
    blue.fill();

    Colour green = colourFactory.getColour("Green");
    green.fill();

    Colour red = colourFactory.getColour("Red");
    red.fill();
    
  }

}
