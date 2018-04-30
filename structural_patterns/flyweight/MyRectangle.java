import java.awt.*;

public class MyRectangle {

  private Color color;
  private int upperX, lowerX, upperY, lowerY;

  public MyRectangle(Color color) {
    this.color = color;
  }

  public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
    g.setColor(color);
    g.fillRect(upperX, upperY, lowerX, lowerY);
  }

}
