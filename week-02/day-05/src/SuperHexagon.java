import sun.java2d.xr.GrowableRectArray;

import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SuperHexagon {

  final static int WIDTH = 640;
  final static int HEIGHT = 640;
  final static int LENGTH = 40;


  public static void mainDraw(Graphics graphics) {

    draw(0, graphics);
  }

  public static void draw(int x, Graphics graphics){

    drawHexagon(100, 100, 100, graphics);

  }

  public static void drawHexagon(int x, int y, int l, Graphics graphics){

    int h = (int) (0.866 * l); // half height from flat

    int xpoints[] = {x, x + l, (int) (x + 1.5 * l), x + l, x, (int) (x - 0.5 * l)};
    int ypoints[] = {y, y, y + h, y + 2 * h, y + 2 * h, y + h};
    int npoints = xpoints.length;

    graphics.drawPolygon(xpoints, ypoints, npoints);


  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Super Hexagon");
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