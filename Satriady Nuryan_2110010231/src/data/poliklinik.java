/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class poliklinik {
    
    private int idPoli;
    private String namaPoli;
    private int biayaPoli;

    // Constructor
    public poliklinik(int idPoli, String namaPoli, int biayaPoli) {
        this.idPoli = idPoli;
        this.namaPoli = namaPoli;
        this.biayaPoli = biayaPoli;
    }

    // Getter dan Setter
    public int getidPoli() {
        return idPoli;
    }

    public void setidPoli(int idPoli) {
        this.idPoli = idPoli;
    }

    public String getnamaPoli() {
        return namaPoli;
    }

    public void setnamaPoli(String namaPoli) {
        this.namaPoli = namaPoli;
    }

    public int getbiayaPoli() {
        return biayaPoli;
    }

    public void setbiayaPoli(int biayaPoli) {
        this.biayaPoli = biayaPoli;
    }
    
    

    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Poli");
        System.out.println("=============");
        System.out.println("ID Poli: " + idPoli);
        System.out.println("Nama Poli: " + namaPoli);
        System.out.println("Biaya Poli: " + biayaPoli);
        System.out.println("");
    }
}
