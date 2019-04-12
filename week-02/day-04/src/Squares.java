
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Squares {

  static final int WIDTH = 640;
  static final int HEIGHT = 640;
  static final int LENGTH = WIDTH;


  public static void mainDraw(Graphics graphics) {

    drawSquares(WIDTH, HEIGHT, LENGTH, 1, graphics);

  }

  public static void drawSquares(int x, int y, int length, int shift, Graphics g){


    g.setColor(Color.BLACK);
    g.drawRect(x, y, length, length);

    if (length > WIDTH / Math.pow(3, 1)){

      drawSquares(x/3, 0, length / 3, shift, g); //2*

      drawSquares(0, y/3, length / 3, shift, g); //4*

      drawSquares(x*2/3, y/3,length / 3, shift, g); //6*

      drawSquares(x/3, y*2/3,length / 3, shift, g); //8*
    }

  }

  // Don't touch the code below

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