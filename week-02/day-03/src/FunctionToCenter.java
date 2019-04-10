import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int x = 0;
    int y = 0;
    int step = 20;
    boolean mod = true;

    for (int i = 0; i < 2 * (WIDTH + HEIGHT); i++){

      if (i % step == 0) {

        if (i < (WIDTH)) {
          x += step;
        }
        else if (i < (HEIGHT + WIDTH)){
          y = HEIGHT;
          x -= step;
        }
        else if (i < (HEIGHT + 2 * WIDTH)){
          y -= step;
        }
        else {
          x = WIDTH;
          y += step;
        }


        drawLineFunc(x, y, graphics);

      }

    }




//    for (int i = 0; i < (2 * (WIDTH + HEIGHT) / step); i++){
//a
//
//      drawLineFunc(x, y, graphics);
//
//      if ((x != WIDTH) && (y == 0) || (x != WIDTH) && (y == HEIGHT)){
//
//        x += step;
//
//      } else if ((y != HEIGHT) && (x == 0) || (y != HEIGHT) && (x == WIDTH)){
//
//        y += step;
//
//      }
//
//
//      System.out.println("X " + x + " Y " + y);
//    }

  }

  public static void drawLineFunc(int x, int y, Graphics graphics){

    graphics.drawLine(x, y, WIDTH / 2, WIDTH / 2);

  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 640;

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