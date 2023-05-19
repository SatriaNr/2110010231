/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author asus
 */
public class diagnosa {
    
    private int idDiagnosa;
    private String diagnosa;
    private String keluhan;

    // Constructor
    public diagnosa(int idDiagnosa, String diagnosa, String keluhan) {
        this.idDiagnosa = idDiagnosa;
        this.diagnosa = diagnosa;
        this.keluhan = keluhan;
    }

    // Getter dan Setter
    public int getIdDiagnosa() {
        return idDiagnosa;
    }

    public void setIdDiagnosa(int idDiagnosa) {
        this.idDiagnosa = idDiagnosa;
    }

    public String getdiagnosa() {
        return diagnosa;
    }

    public void setdiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getkeluhan() {
        return keluhan;
    }

    public void setkeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    
    // Method
    public void tampilkanInfo() {
        System.out.println("Data Diagnosa");
        System.out.println("================="); 
        System.out.println("ID Diagnosa: " + idDiagnosa);
        System.out.println("Diagnosa: " + diagnosa);
        System.out.println("Keluhan: " + keluhan);
        System.out.println("");
        
    }
    
    
}
