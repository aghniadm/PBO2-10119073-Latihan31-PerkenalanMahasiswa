package pbo2.pkg10119073.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk memperkenalkan diri 
 * dengan menampilkan nama dan NIM mahasiswa dengan object oriented
 *
 */

public class Mahasiswa {
    public String nim;
    public String nama;

    public void setNIM(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama + "\n");
    }
    
}