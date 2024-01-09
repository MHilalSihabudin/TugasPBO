public class Rumah {

    public static void main(String[] args) {
        Rumah r = new Rumah();
        r.tampillokasi();
        r.tampilukuran(10, 8);
        r.tampilkannama();
        r.jumlahSiswa(23, 43);
    }

    public void tampilukuran(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("ukuran rumah: " + luas);
    }

    public void tampillokasi() {
        String alamat = "malang";
        System.out.println("lokasi rumah: " + alamat);
    }

    public void tampilkannama() {
        System.out.println("SMK TELKOM");
    }

    public void jumlahSiswa(int rombel, int jumlahSiswa) {
        int total = rombel * jumlahSiswa;
        System.out.println("Jumlah Siswa: " + total);
    }
}
