/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manusia budi = new Manusia();
        budi.nama = "Yanto";
        budi.jenisKelamin = "Laki - Laki";
        budi.alamat = "Cirebon";
        
        Manusia Tini = new Manusia();
        Tini.nama = "Tana";
        Tini.jenisKelamin = "perempuan";
        Tini.alamat = "Sumedang";
        
        budi.TampilInformasi();
        Tini.TampilInformasi();
        
    }    
    
}
