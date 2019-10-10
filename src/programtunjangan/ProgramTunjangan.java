/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBONGULANG
 * NIM          : 10116413
 * DESKRIPSI    : BERISI PROGRAM MENGHITUNG TUJUAN KARYAWAN
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gajiPokok;
        double tunjangan;
        double totalAkhir;
        String status = null ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========Program Tunjangan=========");
        System.out.print("Berapa Gaji Pokok anda perbulan? Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status anda (Menikah/Belum)? ");
        status = scanner.next();

        if ("Menikah".equals(status)) {
            tunjangan = gajiPokok * 0.35;
        } else {
            tunjangan = 0;
        }

        totalAkhir = tunjangan + gajiPokok;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t\t : Rp. " + gajiPokok);
        System.out.println("Tunjangan\t\t : Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t : Rp. " + totalAkhir);
        System.out.println("(Developed by : Harry Apriadi)");
    }
    
}
