/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Gaji Karyawan
 */
public class PBOIF210119056Latihan51GajiKaryawan {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Manager manager=new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(input.next());
        input.nextLine();
        System.out.print("Masukkan Nama : ");
        manager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(input.nextInt());
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t: "+manager.getNik());
        System.out.println("NAMA\t: "+manager.getNama());
        System.out.println("GOLONGAN: "+manager.getGolongan());
        System.out.println("JABATAN\t: "+manager.getJabatan());
        System.out.println("TUNJANGAN GOLONGAN\t : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t : "+manager.tunjanganKehadiran(1));
        
        System.out.println("GAJI TOTAL\t : "+manager.gajiTotal());
    }
    
}
