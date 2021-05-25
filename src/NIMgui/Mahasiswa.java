package NIMgui;

public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String JenjangPendidikan;
    private String TahunMasuk;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorUrut;

    public Mahasiswa() {
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJenjangPendidikan() {
        return JenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        JenjangPendidikan = jenjangPendidikan;
    }

    public String getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        TahunMasuk = tahunMasuk;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getNomorUrut() {
        return NomorUrut;
    }

    public void setNomorUrut(String nomorUrut) {
        NomorUrut = nomorUrut;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama='" + Nama + '\'' +
                ", NIM='" + NIM + '\'' +
                ", JenjangPendidikan='" + JenjangPendidikan + '\'' +
                ", TahunMasuk='" + TahunMasuk + '\'' +
                ", Fakultas='" + Fakultas + '\'' +
                ", Jurusan='" + Jurusan + '\'' +
                ", JenisKelamin='" + JenisKelamin + '\'' +
                ", NomorUrut='" + NomorUrut + '\'' +
                '}';
    }
}
