import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Client extends JFrame {

  JButton startDrawing;

  int windowWidth = 1750;
  int windowHeight = 150;

  Color [] shapeColour = {Color.orange, Color.red, Color.yellow, Color.blue,
            Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

  public static void main(String [] args) {

    new Client();

  }

  public Client() {
    this.setSize(windowWidth, windowHeight);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Client");

    JPanel contentPane = new JPanel();
    contentPane.setLayout(new BorderLayout());

    final JPanel drawingPanel = new JPanel();

    startDrawing = new JButton("Draw stuff");

    contentPane.add(drawingPanel, BorderLayout.CENTER);
    contentPane.add(startDrawing, BorderLayout.SOUTH);

    startDrawing.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event){

        Graphics g = drawingPanel.getGraphics();

        // code to draw rectangles. Rest is GUI stuff
        long startTime = System.currentTimeMillis();

        for (int i=0; i < 100000; ++i) {

          // color is intrensic(can share). Size is extrensic(does not share)
          MyRectangle rectangle = RectangleFactory.getRectangle(getRandColor());
          rectangle.draw(g, getRandX(), getRandX(), getRandY(), getRandY());

        }

        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime));
      }
    });

    this.add(contentPane);
    this.setVisible(true);
  }

  private Color getRandColor() {

    Random randomGenerator = new Random();
    int randInt = randomGenerator.nextInt(9);
    return shapeColour[randInt];

  }

  private int getRandX() { return (int)(Math.random() * windowWidth); }

  private int getRandY() { return (int)(Math.random() * windowHeight); }

}
