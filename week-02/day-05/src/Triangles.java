import sun.java2d.xr.GrowableRectArray;

import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Triangles {

  final static int WIDTH = 640;
  final static int HEIGHT = 640;
  final static int LENGTH = 40;


  public static void mainDraw(Graphics graphics) {

    drawThemAll(0, HEIGHT, graphics);
  }

  public static void drawThemAll(int x, int y, Graphics graphics){

    drawTriangle(0, HEIGHT, WIDTH, LENGTH, graphics);

  }

  public static void drawTriangle(int x, int y, int maxWidth, int length, Graphics graphics){

    int h = (int) (0.866 * length);

    graphics.drawLine(x, y, x + length, y);
    graphics.drawLine(x + length, y, x + length/2, y - h);
    graphics.drawLine(x + length/2, y - h, x, y);

    if ((x < maxWidth - length)){
      drawTriangle(x + length, y, maxWidth, length, graphics);
      drawTriangle(x + length / 2, y - h, maxWidth - length/2, length, graphics);
    }

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