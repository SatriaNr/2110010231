/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class kritiksaran {
    
    private int idKritik;
    private String kritik;
    private int tanggalKritik;
    private int nip;

    // Constructor
    public kritiksaran(int idKritik, String kritik, int tanggalKritik, int nip) {
        this.idKritik = idKritik;
        this.kritik = kritik;
        this.tanggalKritik = tanggalKritik;
        this.nip = nip;
    }

    // Getter dan Setter
    public int getIdKritik() {
        return idKritik;
    }

    public void setIdKritik(int idKritik) {
        this.idKritik = idKritik;
    }

    public String getkritik() {
        return kritik;
    }

    public void setkritik(String kritik) {
        this.kritik = kritik;
    }

    public int gettanggalKritik() {
        return tanggalKritik;
    }

    public void settanggalKritik(int tanggalKritik) {
        this.tanggalKritik = tanggalKritik;
    }
    
    public int getnip() {
        return nip;
    }

    public void setnip(int nip) {
        this.nip = nip;
    }

    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Kritik dan Saran");
        System.out.println("================");
        System.out.println("ID Kritik: " + idKritik);
        System.out.println("Kritik: " + kritik);
        System.out.println("Tanggal: " + tanggalKritik);
        System.out.println("Nip: " + nip);
        System.out.println("");
    }
    
    
}
