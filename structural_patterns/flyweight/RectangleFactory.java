// create rectangle if it uses a color not previously used
// else uses stored object that is already created
// stored in hashmap

// time without design - 396 ms
// time with design - 132 ms
import java.util.HashMap;
import java.awt.Color;

public class RectangleFactory {

  private static final HashMap<Color, MyRectangle> rectangleByColor = new HashMap<Color, MyRectangle>();

  public static MyRectangle getRectangle(Color color) {

    MyRectangle rectangle = (MyRectangle)rectangleByColor.get(color);

    if (rectangle == null) {
      rectangle = new MyRectangle(color);

      rectangleByColor.put(color, rectangle);
    }

    return rectangle;

  }

}
