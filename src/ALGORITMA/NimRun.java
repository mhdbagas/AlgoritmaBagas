package ALGORITMA;

import java.util.Scanner;

public class NimRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : Muhammad Bagas Akbar ");
        String nama = input.nextLine();
        String nim = input.nextLine();

        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Perndidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = 20"+objNim.getTahun());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorurut());
    }
}
