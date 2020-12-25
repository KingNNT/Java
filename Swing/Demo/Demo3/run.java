import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class run extends JFrame {
    static JFrame f;
    public static void main(String[] args) {
        f = new JFrame("panel");
        JPanel p = new JPanel();
        p.setBackground(Color.red);

        f.add(p);
        f.setSize(300, 300);

        f.show();
    }
}