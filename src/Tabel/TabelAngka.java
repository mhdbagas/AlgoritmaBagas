package Tabel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelAngka {
    private JTextField textAngka;
    private JTextField urutkanButton;
    private JPanel rootPanel;
    private JTable tabelAngka;
    private JTextField textAngka2;
    private JButton buttonUrutkan;
    private DefaultTableModel tableModel;
    private boolean added = false;
    public JPanel getRootPanel() {
        return rootPanel;
        }


    public TabelAngka() {
        this.initComponents();
        buttonUrutkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tabelAngka.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textAngka2.getText());
                String[] stmp = input.split(",");
                if (textAngka2.getText().length() > 3) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Terlalu Banyak\nMax Input : 999",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
               if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
              //  boolean added = true;
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : Urut.getas(input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Urut.getdes(input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });

    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] iniData = {

        };
        tableModel = new DefaultTableModel(iniData, tableColom);
        tabelAngka .setModel(tableModel);
        tabelAngka.setAutoCreateRowSorter(true);
        tabelAngka.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    public JTextField getTextAngka() {
        return textAngka;
    }

    public void setTextAngka(JTextField textAngka) {
        this.textAngka = textAngka;
    }

    public JTextField getUrutkanButton() {
        return urutkanButton;
    }

    public void setUrutkanButton(JTextField urutkanButton) {
        this.urutkanButton = urutkanButton;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JTable getTabelAngka() {
        return tabelAngka;
    }

    public void setTabelAngka(JTable tabelAngka) {
        this.tabelAngka = tabelAngka;
    }

    public JTextField getTextAngka2() {
        return textAngka2;
    }

    public void setTextAngka2(JTextField textAngka2) {
        this.textAngka2 = textAngka2;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
}
