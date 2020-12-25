package Demo1;

import javax.swing.*;

/**
 * GUI
 */
public class GUI {
    private JFrame f = new JFrame();

    GUI() {

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    protected void func() {
        // GUI obj = new GUI();
        addButton();
        addTitle();

    }

    private void addButton() {

        JButton btn = new JButton();
        btn.setBounds(130, 100, 100, 50);
        btn.setText("Click Me");
        f.add(btn);
    }

    private void addTitle() {
        JLabel title = new JLabel();
        title.setText("MSTool by KingNNT");
        title.setBounds(150, 00, 200, 50);
        f.add(title);
    }
}