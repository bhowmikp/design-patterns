public class Client {

  public static void main (String [] args) {

    ShapeFactory shapeFactory = new ShapeFactory();

    // create Circle
    Shape circle = shapeFactory.getShape("Circle");
    circle.draw();

    // create Square
    Shape square = shapeFactory.getShape("Square");
    square.draw();

    // create Rectangle
    Shape rectangle = shapeFactory.getShape("Rectangle");
    rectangle.draw();

  }

}
