/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class kwitansi {
    
    private int idKwitansi;
    private int idRekam;
    private String keterangan;
    private int biaya;
    private int tanggalBayar;

    // Constructor
    public kwitansi(int idKwitansi,int idRekam, String keterangan, int biaya, int tanggalBayar) {
        this.idKwitansi = idKwitansi;
        this.idRekam = idRekam;
        this.keterangan = keterangan;
        this.biaya = biaya;
        this.tanggalBayar = tanggalBayar;
    }

    // Getter dan Setter
    public int getidKwitansi() {
        return idKwitansi;
    }

    public void setidKwitansi(int idKwitansi) {
        this.idKwitansi = idKwitansi;
    }

    public int getidRekam() {
        return idRekam;
    }

    public void setidRekam(int idRekam) {
        this.idRekam = idRekam;
    }

    public String getketerangan() {
        return keterangan;
    }

    public void setketerangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public int getbiaya() {
        return biaya;
    }

    public void setbiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int gettanggalBayar() {
        return tanggalBayar;
    }

    public void settanggalBayar(int tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }
    
    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Kwitansi");
        System.out.println("===============");
        System.out.println("ID Kwitansi: " + idKwitansi);
        System.out.println("Rekam: " + idRekam);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("biaya: " + biaya);
        System.out.println("tanggal bayar: " + tanggalBayar);
        System.out.println("");
    }
    
}
