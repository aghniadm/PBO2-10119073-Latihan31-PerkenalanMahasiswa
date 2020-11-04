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

public class perkenalanMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNIM("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNIM("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNIM("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();
        
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNIM("10110269");
        mhs4.setNama("Muhammad Nur Awaludin");
        mhs4.perkenalkanDiri();
    }
    
}
