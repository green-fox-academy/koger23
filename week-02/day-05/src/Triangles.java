import sun.java2d.xr.GrowableRectArray;

import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Triangles {

  final static int WIDTH = 320;
  final static int HEIGHT = 320;
  final static int LENGTH = 40;


  public static void mainDraw(Graphics graphics) {

    drawThemAll(0, HEIGHT, graphics);
  }

  public static void drawThemAll(int x, int y, Graphics graphics){

    int h = (int) (0.866 * LENGTH);
    int length = LENGTH;


      for (int i=0; i < WIDTH; i += LENGTH){

        graphics.drawLine(x + i, y, x + i + length, y);
        graphics.drawLine(x + i + length, y, x + i + length/2, HEIGHT - h);
        graphics.drawLine(x + i + length/2, HEIGHT - h, x + i, y);

      }

  }

  public static void drawTriangle(int x, int y, int length, Graphics graphics){

    int h = (int) (0.866 * length);

    graphics.drawLine(x, y, x + length, y);
    graphics.drawLine(x + length, y, x + length/2, HEIGHT - h);
    graphics.drawLine(x + length/2, HEIGHT - h, x, y);

  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Triangles");
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