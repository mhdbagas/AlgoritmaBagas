package Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleTable1 {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textHP;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponent();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String email = textEmail.getText();
                String hp = textHP.getText();
                if(nama.isBlank() || email.isBlank() || hp.isBlank()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama, email, hp});
                    //clear textfields
                    textNama.setText("");
                    textEmail.setText("");
                    textHP.setText("");


                }

            }
        });
    }

    private void initComponent(){
        Object[] tableColom = {
                "Nama",
                "Email",
                "HP",
        };
        Object[][] initData = {
                {"Bagas", "bagas@email.com", "089661322212"},
                {"Akbar", "akbar@email.com", "085271234898"}
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableBiodata.setModel(tableModel);
        //menampilkan sorting di setiap colom
        tableBiodata.setAutoCreateRowSorter(true);
        //enable single selection
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    }
}
