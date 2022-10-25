/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ContohFungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematika mtk = new Matematika();
        mtk.nilai1 = 100;
        mtk.nilai2 = 10;
        
        int hasil = mtk.tambah();
        System.out.println("Hasil tambah() = " + hasil);
        
        int hasil2 = mtk.kurang();
        System.out.println("Hasil kurang() = " + hasil2);
        
        int hasil3 = mtk.kali();
        System.out.println("Hasil kali() = " + hasil3);
        
        int hasil4 = mtk.bagi();
        System.out.println("Hasil bagi() = " + hasil4);
    }
   
}
