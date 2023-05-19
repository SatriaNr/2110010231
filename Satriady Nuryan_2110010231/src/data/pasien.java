/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class pasien {
    
    private int nip;
    private String namaPasien;
    private String jk;
    private String alamat;
    private int usia;
    private int kk;
    private String tanggalDaftar;
    

    // Constructor
    public pasien(int nip, String namaPasien, String jk,String alamat, int usia, int kk, String tanggalDaftar) {
        this.nip = nip;
        this.namaPasien = namaPasien;
        this.jk = jk;
        this.alamat = alamat;
        this.usia = usia;
        this.kk = kk;
        this.tanggalDaftar = tanggalDaftar;
    }

    // Getter dan Setter
    public int getnip() {
        return nip;
    }

    public void setnip(int nip) {
        this.nip = nip;
    }

    public String getnamaPasien() {
        return namaPasien;
    }

    public void setnamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getjk() {
        return jk;
    }

    public void setjk(String jk) {
        this.jk = jk;
    }
    
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int getusia() {
        return usia;
    }

    public void setusia(int usia) {
        this.usia = usia;
    }
    
    public int getkk() {
        return kk;
    }

    public void setkk(int kk) {
        this.kk = kk;
    }
    
    public String gettanggalDaftar() {
        return tanggalDaftar;
    }

    public void settanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }
    
    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Pasien");
        System.out.println("==============");
        System.out.println("nip: " + nip);
        System.out.println("nama: " + namaPasien);
        System.out.println("jenis: " + jk);
        System.out.println("alamat: " + alamat);
        System.out.println("usia: " + usia);
        System.out.println("no kk: " + kk);
        System.out.println("tanggal daftar: " + tanggalDaftar);
        System.out.println("");
        
    }
    
}
