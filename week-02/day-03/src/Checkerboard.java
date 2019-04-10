import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int length = 20;
    int i_max = WIDTH / length; // horizontal Qty
    int j_max = HEIGHT / length; // vertical Qty
    int pos_x = 0;
    int pos_y = 0;

    for (int i = 0; i < i_max; i++){

      for (int j = 0; j < j_max; j++){

        if ((j + i) % 2 == 0){

          graphics.setColor(Color.black);

        } else {

          graphics.setColor(Color.white);
        }

        graphics.fillRect(pos_x, pos_y, length, length);

        pos_x += length;

      }

      pos_x = 0;
      pos_y += length;

    }

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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