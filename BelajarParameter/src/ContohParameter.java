/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ContohParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        int a = mtk.tambah(100, 50);
        System.out.println("hasil tambah = " + a);
        
        a = mtk.kurang(255, 75);
        System.out.println("hasil kurang = " + a);
        
        a = mtk.kali(255, 75);
        System.out.println("hasil kali = " + a);
        
        double b = mtk.bagi(100.0, 3.0);
        System.out.println("hasil bagi = " + b);
    }
    
}
