package Table;

import NIMgui.FormGui;

import javax.swing.*;

public class RunExampleTable1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        ImageIcon imageIcon = new ImageIcon( "Image/FOTO.jpeg ");
        JFrame jFrame = new JFrame("Form Biodata with Table");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new ExampleTable1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);


    }
}
