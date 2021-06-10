package Tabel;

import Table.ExampleTable1;

import javax.swing.*;

public class RunTabelAngka {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon( "Image/FOTO.jpeg ");
        JFrame jFrame = new JFrame("Form Sorting");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TabelAngka().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
