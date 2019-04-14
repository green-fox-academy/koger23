//import sun.java2d.xr.GrowableRectArray;

import javax.swing.*;

import java.awt.*;
//import java.awt.image.ImageObserver;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SuperHexagon {


  static int SIDE_ELEMENTS = 5;

  final static int WIDTH = 640;
  final static int HEIGHT = 640;
  final static int LENGTH = 30;
  static int height = (int) (0.866 * LENGTH); // half height from flat

  final static int MAX_COLUMN_NUMBER = 2 * SIDE_ELEMENTS - 1;
  static int MAX_ROW_NUMBER = height * 2 * (2 * SIDE_ELEMENTS - 1);


  public static void mainDraw(Graphics graphics) {
    drawHexagons(WIDTH / 2 - LENGTH, 0, graphics);
  }

  public static void drawHexagons(int x, int y, Graphics graphics) {

    int x_min = (int) (WIDTH / 2 - LENGTH - (SIDE_ELEMENTS - 1) * LENGTH * 1.5);
    int x_max = (int) (WIDTH / 2 + (SIDE_ELEMENTS - 1) * LENGTH);
    int y_max = MAX_ROW_NUMBER;

    drawHexagon(x, y, graphics);

    if ((x > x_min) && (x < x_max) && (y < y_max)){

      drawHexagons(x,y + height * 2, graphics);
      drawHexagons((int) (x - 1.5 * LENGTH), y + height, graphics);
      drawHexagons((int) (x + 1.5 * LENGTH), y + height, graphics);
    }
  }

  public static void drawHexagon(int x, int y, Graphics graphics) {

    int xpoints[] = {(int) (x + 0.5 * LENGTH), (int) (x + 1.5 * LENGTH), (int) (x + 2 * LENGTH), (int) (x + 1.5 * LENGTH), (int) (x + 0.5 * LENGTH), (int) (x)};
    int ypoints[] = {y, y, y + height, y + 2 * height, y + 2 * height, y + height};
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