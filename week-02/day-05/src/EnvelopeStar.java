import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {

  final static int WIDTH = 640;
  final static int HEIGHT = 640;
  final static int SCALE = 32;
  final static int middleH = WIDTH / 2;
  final static int middleV = HEIGHT / 2;
  final static Color greenColor = new Color(0, 180, 50);


  public static void mainDraw(Graphics graphics) {

    graphics.setColor(greenColor);
    drawThemAllRecursive(SCALE / 2 - 1, graphics);
//    drawThemAllLoop(graphics);
//    drawThemAllManually(graphics);
  }

  public static void drawThemAllRecursive(int counter, Graphics graphics) {

    graphics.drawLine( middleH, middleV - counter * HEIGHT / SCALE, middleH + (SCALE / 2 - counter) * WIDTH / SCALE, middleV);
    graphics.drawLine( middleH, middleV + counter * HEIGHT / SCALE, middleH - (SCALE / 2 - counter) * WIDTH / SCALE, middleV);
    graphics.drawLine( middleH, middleV + counter * HEIGHT / SCALE, middleH + (SCALE / 2 - counter) * WIDTH / SCALE, middleV);
    graphics.drawLine( middleH, middleV - counter * HEIGHT / SCALE, middleH - (SCALE / 2 - counter) * WIDTH / SCALE, middleV);

    if (counter > 1){
      drawThemAllRecursive(counter - 1, graphics);
    }

  }

  public static void drawThemAllLoop(Graphics graphics){

    for (int i=1; i < SCALE/2; i++){
      graphics.drawLine( middleH, middleV - i * HEIGHT / SCALE, middleH + (SCALE/2 - i) * WIDTH / SCALE, middleV);
      graphics.drawLine( middleH, middleV + i * HEIGHT / SCALE, middleH + (SCALE/2 - i) * WIDTH / SCALE, middleV);
      graphics.drawLine( middleH, middleV + i * HEIGHT / SCALE, middleH - (SCALE/2 - i) * WIDTH / SCALE, middleV);
      graphics.drawLine( middleH, middleV - i * HEIGHT / SCALE, middleH - (SCALE/2 - i) * WIDTH / SCALE, middleV);
    }

  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Envelope Star");
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