/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class kunjungan {
    
    private int idKunjungan;
    private int nip;
    private int idPoli;
    private String tanggalKunjungan;

    // Constructor
    public kunjungan(int idKunjungan, int nip, int idPoli, String tanggalKunjungan) {
        this.idKunjungan = idKunjungan;
        this.nip = nip;
        this.idPoli = idPoli;
        this.tanggalKunjungan = tanggalKunjungan;
    }

    // Getter dan Setter
    public int getidKunjungan() {
        return idKunjungan;
    }

    public void setidKunjungan(int idKunjungan) {
        this.idKunjungan = idKunjungan;
    }

    public int getnip() {
        return nip;
    }

    public void setnip(int nip) {
        this.nip = nip;
    }

    public int getidPoli() {
        return idPoli;
    }

    public void setidPoli(int idPoli) {
        this.idPoli = idPoli;
    }
    
    public String gettanggalKunjungan() {
        return tanggalKunjungan;
    }

    public void settanggalKunjungan(String tanggalKunjungan) {
        this.tanggalKunjungan = tanggalKunjungan;
    }

    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Kunjungan");
        System.out.println("================");
        System.out.println("ID Kunjungan: " + idKunjungan);
        System.out.println("nip: " + nip);
        System.out.println("ID Poli: " + idPoli);
        System.out.println("Tanggal Kunjungan: " + tanggalKunjungan);
        System.out.println("");
    }
}
