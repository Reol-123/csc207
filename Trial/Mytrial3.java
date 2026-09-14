import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Mytrial3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
        () -> {
            JFrame frame = new JFrame("Intro JFrame Example");
            frame.setMinimumSize(new java.awt.Dimension(300, 200));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            JPanel firstNamePanel = new JPanel();
            firstNamePanel.add(new JLabel("First Name:"));
            firstNamePanel.add(new JTextField(10));
        });
    }
}
