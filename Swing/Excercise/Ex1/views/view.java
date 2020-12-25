package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class view {

    class exit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class add implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }



    private JFrame frame = new JFrame("Nhà Hàng ITC");
    private Color bgColor = new Color(96, 249, 255);

    public view() {
        this.setFrame();
    }

    private void setFrame() {
        this.frame.setSize(500, 600);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
        this.frame.add(createPanel());
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

        JLabel labelConVat = this.Text("Chọn con vật", 50, 30);
        panel.add(labelConVat);

        this.addradio(panel);

        JLabel labelCheBien =this.Text("Chọn cách chế biến", 50, 230);
        panel.add(labelCheBien);

        this.addChb(panel);

        JButton btnExit = this.button("Thoát", Color.RED, 350, 100);
        btnExit.addActionListener(new exit());
        panel.add(btnExit);

        JButton btnAdd =  this.button(">>", Color.WHITE, 200, 270);
        panel.add(btnAdd);

        JButton btnRemove =  this.button("<<", Color.WHITE, 200, 330);
        panel.add(btnRemove);

        JList list = this.list();
        panel.add(list);
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
        btn.setBounds(x, y, 80, 30);
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
        JList list;
        list = new JList();
        list.setBounds(300, 250, 180, 250);

        return list;
    }
}