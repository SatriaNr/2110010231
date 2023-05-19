/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class rekammedis {
    
    private int idRekam;
    private int nip;
    private int idDiagnosa;
    private int idPoli;
    private int tanggalRekam;

    // Constructor
    public rekammedis(int idRekam, int nip,int idDiagnosa, int idPoli, int tanggalRekam) {
        this.idRekam = idRekam;
        this.nip = nip;
        this.idDiagnosa = idDiagnosa;
        this.idPoli = idPoli;
        this.tanggalRekam = tanggalRekam;
    }

    // Getter dan Setter
    public int getIdRekam() {
        return idRekam;
    }

    public void setIdRekam(int idRekam) {
        this.idRekam = idRekam;
    }

    public int getnip() {
        return nip;
    }

    public void setnip(int nip) {
        this.nip = nip;
    }

    public int getidDiagnosa() {
        return idDiagnosa;
    }

    public void setidDiagnosa(int idDiagnosa) {
        this.idDiagnosa = idDiagnosa;
    }

    public int getidPoli() {
        return idPoli;
    }

    public void setidPoli(int idPoli) {
        this.idPoli = idPoli;
    }
    
    public int gettanggalRekam() {
        return idPoli;
    }

    public void settanggalRekam(int idtanggalRekam) {
        this.tanggalRekam = tanggalRekam;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Rekam Medis");
        System.out.println("===================");
        System.out.println("ID Rekam: " + idRekam);
        System.out.println("nip: " + nip);
        System.out.println("ID Diagnosa: " + idDiagnosa);
        System.out.println("ID Poli: " + idPoli);
        System.out.println("Tanggal Rekam: " + tanggalRekam);
        System.out.println("");
        
    }
    
}
