import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {

  final static int WIDTH = 320;
  final static int HEIGHT = 320;
  final static Color greenColor = new Color(100, 200, 50);


  public static void mainDraw(Graphics graphics) {

    drawThemAll(WIDTH, HEIGHT, graphics);
  }

  public static void drawThemAll(int x, int y, Graphics graphics){



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