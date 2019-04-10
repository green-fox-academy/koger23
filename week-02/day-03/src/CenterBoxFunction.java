import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameter:
    // the square size and the graphics
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.



    for (int i = 0; i < 3; i++) {

      squareDrawing((int) (Math.random() * 100 + 50), graphics);

    }

  }

  public static void squareDrawing(int length, Graphics graphics){

    int x1 = (WIDTH - length) / 2;
    int y1 = (HEIGHT - length) / 2;

    graphics.drawRect(x1, y1, length, length);

  }

  // Don't touch the code below
  static int WIDTH = 1920/2;
  static int HEIGHT = 1080/2;

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