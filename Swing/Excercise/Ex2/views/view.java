package views;

import javax.swing.*;
import java.awt.*;

public class view {

    private JFrame frame = new JFrame("Student Detail");
    private Color bgColor = new Color(96, 249, 255);

    public view() {
        this.setFrame();
    }

    private void setFrame() {
        this.frame.setSize(1000, 600);
        this.frame.setLayout(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);

        this.frame.setContentPane(createPanel());
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

        // JLabel labelName = this.Text("Name", 10, 30);
        // panel.add(labelName);

        JTextField textFieldName = this.textField(80,30,150,20);
        panel.add(textFieldName);

        // JLabel labelAddress =this.Text("Address", 10, 80);
        // panel.add(labelAddress);

        // JTextField textFieldAddress = this.textField(80, 80, 250, 100);
        // panel.add(textFieldAddress);


        // JButton btnExit = this.button("Validate", Color.WHITE, 150, 500);
        // panel.add(btnExit);

        // JList list = this.list();
        // panel.add(list);
        
        return panel;
    }

    private JLabel Text(String s, int x, int y) {
        JLabel text = new JLabel();
        text.setText(s);
        text.setBounds(x, y, 200, 20);
        text.setBackground(Color.WHITE);
        return text;
    }

    private void addradio(JPanel panel) {
        ButtonGroup group = new ButtonGroup();
        JRadioButton rt1 = new JRadioButton("Bò", false);
        rt1.setBounds(70, 50, 50, 50);
        rt1.setBackground(bgColor);
        JRadioButton rt2 = new JRadioButton("Gà", false);
        rt2.setBounds(70, 100, 50, 50);
        rt2.setBackground(bgColor);
        JRadioButton rt3 = new JRadioButton("Cá", false);
        rt3.setBounds(70, 150, 50, 50);
        rt3.setBackground(bgColor);

        group.add(rt1);
        group.add(rt2);
        group.add(rt3);

        panel.add(rt1);
        panel.add(rt2);
        panel.add(rt3);

    }

    private void addChb(JPanel panel) {
        JCheckBox cb1 = new JCheckBox("Nướng", false);
        cb1.setBounds(70, 250, 100, 50);
        cb1.setBackground(bgColor);
        JCheckBox cb2 = new JCheckBox("Luộc", false);
        cb2.setBounds(70, 300, 100, 50);
        cb2.setBackground(bgColor);
        JCheckBox cb3 = new JCheckBox("Chiên", false);
        cb3.setBounds(70, 350, 100, 50);
        cb3.setBackground(bgColor);

        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
    }

    private JButton button(String s, Color color, int x, int y) {
        JButton btn = new JButton();
        btn.setBounds(x, y, 120, 30);
        btn.setText(s);
        btn.setBackground(color);

        return btn;
    }

    private TextArea textArea() {
        TextArea area = new TextArea();
        area.setBounds(300, 250, 200, 250);

        return area;
    }

    private JList list() {
        String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        JList list = new JList(week);
        list.setBounds(300, 250, 180, 250);

        return list;
    }

    private JTextField textField (int x, int y, int width, int height) {
        JTextField tf = new JTextField();
        tf.setBounds(x,y,width, height);
        return tf;
    }
}