import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Entry Point.
 * 
 * @author Mohamed Mansour
 * @since 2010-06-23
 */
public class Main {
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Look and Feel.
    try {
      UIManager.setLookAndFeel(
      UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) { }
  
    // Show the frame.
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        MainFrame frame = new MainFrame();
        frame.setPreferredSize(new Dimension(500,500));
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    });
  }
}
