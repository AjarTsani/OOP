/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Orang tatang = new Orang();
        tatang.nama = "tatang";
        tatang.alamat = "bandung";
        tatang.umur = 30;
        tatang.menikah = false;
        
        Orang rina = new Orang();
        rina.nama = "rina";
        rina.alamat = "jakarta";
        rina.umur = 20;
        rina.menikah = false;
        
        System.out.println(tatang.nama);
        System.out.println(rina.nama);
    }
    
}
