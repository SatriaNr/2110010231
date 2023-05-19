/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satriady.nuryan_2110010231;

import data.diagnosa;
import data.kritiksaran;
import data.kunjungan;
import data.kwitansi;
import data.pasien;
import data.poliklinik;
import data.rekammedis;
import java.util.Date;

/**
 *
 * @author asus
 */
public class SatriadyNuryan_2110010231 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pasien pasien = new pasien(123, "satria", "laki-laki","jl.sungai", 12, 123,"13 februari" );
        
        kunjungan kunjungan = new kunjungan (1, 123, 1, "13 februari");
        
        poliklinik poliklinik = new poliklinik (1, "poli gigi", 10000);
        
        diagnosa diagnosa = new diagnosa (1, "gigi bergoyang", "sakit gigi");
        
        kritiksaran kritiksaran = new kritiksaran (1, "mohon lebih ramah", 13, 123);
  
        rekammedis rekammedis = new rekammedis (1,123, 1, 1, 13);
        
        kwitansi kwitansi = new kwitansi (1, 1, "MOhon balik 2 hari lagi", 50000, 13 );
        
        
        pasien.tampilkanInfo();
        kunjungan.tampilkanInfo();
        poliklinik.tampilkanInfo();
        diagnosa.tampilkanInfo();
        kritiksaran.tampilkanInfo();
        rekammedis.tampilkanInfo();
        kwitansi.tampilkanInfo();
    }
    
}
