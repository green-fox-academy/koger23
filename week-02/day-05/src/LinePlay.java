import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay {

  final static int WIDTH = 320;
  final static int HEIGHT = 320;
  final static int SCALE = 16;
  final static int STEP = WIDTH / SCALE;
  final static Color greenColor = new Color(100, 200, 50);
  final static Color purpleColor = new Color(180, 100, 255);


  public static void mainDraw(Graphics graphics) {

    drawThemAll(WIDTH, HEIGHT, graphics);
  }

  public static void drawThemAll(int x, int y, Graphics graphics){

    int counter = 1;

    if ( y > 0) {

      graphics.setColor(purpleColor);
      graphics.drawLine(x - STEP, 0, WIDTH, y - STEP);

      graphics.setColor(greenColor);
      graphics.drawLine(x - STEP, HEIGHT,  0, y - STEP);

      if (x + y >= 1) {
        counter++;
        graphics.setColor(purpleColor);
        drawThemAll(x - STEP * counter, y - STEP * counter, graphics);



      }
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