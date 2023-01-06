/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luas.permukaan.balok;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LuasPermukaanBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int p;
        int t;
        int l;
        double hasil;

        
        System.out.print("Masukkan Panjang = ");
        p = input.nextInt();
        
        System.out.print("Masukkan Lebar = ");
        l = input.nextInt();
        
        System.out.print("Masukkan Tinggi = ");
        t = input.nextInt();
        
        System.out.println("Hasil");
        hasil = 2*((p*l) + (p*t) + (l*t));
        System.out.printf("Luas Permukaan Balok = %.2f\n",hasil);
    }
    
}
