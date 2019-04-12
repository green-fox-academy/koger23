import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {

  final static int WIDTH = 320;
  final static int HEIGHT = 320;
  final static Color greenColor = new Color(0, 180, 50);
  final static int STEP = WIDTH / 8;


  public static void mainDraw(Graphics graphics) {

    graphics.setColor(greenColor);
    drawThemAll(WIDTH, HEIGHT, graphics);
  }

  public static void drawThemAll(int x, int y, Graphics graphics){

    graphics.drawLine( x / 2, 0, x / 2 + STEP, y / 2);

    if (x <= WIDTH){

      graphics.drawLine( x / 2, 0 + 1 * STEP, x / 2 + 2 * STEP, y / 2);
      graphics.drawLine( x / 2, 0 + 2 * STEP, x / 2 + 3 * STEP, y / 2);
      graphics.drawLine( x / 2, 0 + 3 * STEP, x / 2 + 4 * STEP, y / 2);

    }



  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Line Play");
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