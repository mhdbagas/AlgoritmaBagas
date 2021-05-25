package NIMgui;

import javax.swing.*;

public class RunFormGui {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame( "Form Gui");
        jFrame.setContentPane(new FormGui().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);

    }
}
