import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 3 parameters:
    // the x and y coordinates of the square's top left corner and the graphics
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    int X_shifter = 0;
    int Y_shifter = 0;

    for (int i = 0; i < 3; i++){


      int x = (int) (Math.random() * 10 + X_shifter);
      int y = (int) (Math.random() * 10 + Y_shifter);

      drawAsquare(x, y, graphics);

      X_shifter += (50 + x);
      Y_shifter += (50 + y);

    }

  }

  public static void drawAsquare(int x, int y, Graphics graphics){

    int l = 50;

    graphics.drawRect(x, y, x + l, y + l);

  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 640;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

}