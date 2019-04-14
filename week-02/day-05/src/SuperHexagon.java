import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SuperHexagon {

  static int SIDE_ELEMENTS = 4; // adjusting number of items on sides

  final static int WIDTH = 640;
  final static int HEIGHT = 640;
  final static int LENGTH = 30;
  static int height = (int) (0.866 * LENGTH); // half height from flat
  static int MAX_ROW_NUMBER = 2 * SIDE_ELEMENTS - 1;
  static int Y_MAX = height * 2 * MAX_ROW_NUMBER - 2* height;


  public static void mainDraw(Graphics graphics) {
    drawHexagonsRecursively(WIDTH / 2 - LENGTH, 0, Y_MAX, graphics);
  }

  public static void drawHexagonsRecursively(int x, int y, int y_max, Graphics graphics) {

    int x_min = (int) (WIDTH / 2 - LENGTH - (SIDE_ELEMENTS - 1) * LENGTH * 1.5);
    int x_max = (int) (WIDTH / 2 + (SIDE_ELEMENTS - 1) * LENGTH);

    drawHexagon(x, y, graphics);

    if ((x > x_min) && (x < x_max) && (y < y_max)){

      drawHexagonsRecursively(x,y + height * 2, y_max, graphics);
      drawHexagonsRecursively((int) (x - 1.5 * LENGTH), y + height,y_max - height, graphics);
      drawHexagonsRecursively((int) (x + 1.5 * LENGTH), y + height,y_max - height, graphics);
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