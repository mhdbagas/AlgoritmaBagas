package NIMgui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormGui {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJenjangPendidikan;
    private JTextField textTahunMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenisKelamin;
    private JTextField textNomorUrut;
    private JButton Save;
    private JPanel rootPanel;



    public FormGui() {
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textNama
                String nama = textNama.getText();
                //mengambil data dari textNim
                String nim = textNim.getText();
                //mengambil data dari Jenjang Pendidikan
                String JenjangPendidikan = textJenjangPendidikan.getText();
                //mengambil data dari Tahun Masuk
                String TahunMasuk = textTahunMasuk.getText();
                //mengambil data dari Fakultas
                String Fakultas = textFakultas.getText();
                //mengambil data dari Jurusan
                String Jurusan = textJurusan.getText();
                //mengambil data dari Jenis Kelamin
                String JenisKelamin = textJenisKelamin.getText();
                //mengambil data dari Nomor Urut
                String NomorUrut = textNomorUrut.getText();
                //diproses

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNIM(nim);
                mhs.setJenjangPendidikan(JenjangPendidikan);
                mhs.setTahunMasuk(TahunMasuk);
                mhs.setJurusan(Jurusan);
                mhs.setFakultas(Fakultas);
                mhs.setJenisKelamin(JenisKelamin);
                mhs.setNomorUrut(NomorUrut);


                System.out.println(mhs.toString());


            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
