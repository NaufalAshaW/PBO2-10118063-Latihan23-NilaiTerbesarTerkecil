/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class NilaiTerbesarTerkecil {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("=====Program Nilai Terbesar dan Terkecil" 
                    + " Nilai Mahasiswa=====");
          System.out.print("Masukkan Nama Petugas : ");
          String petugas = scanner.nextLine();
          System.out.print("Masukkan Jumlah Mahasiswa : ");
          int jmlMhs = scanner.nextInt();
          
          int[] nilaiMhs = new int[jmlMhs];
          int nilaiTerbesar = -9999;
          int nilaiTerkecil = 9999;
          
          for(int i = 0; i < jmlMhs; i++){
              System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " = ");
              nilaiMhs[i] = scanner.nextInt();
              
              if(nilaiMhs[i] > nilaiTerbesar) nilaiTerbesar = nilaiMhs[i];
              if(nilaiMhs[i] < nilaiTerkecil) nilaiTerkecil = nilaiMhs[i];
          }
          
          System.out.println();
          System.out.println("======Hasil Nilai Mahasiswa======");
          for(int i = 0; i < jmlMhs; i++){
              System.out.println("Masukan Nilai Mahasiswa ke-" + (i+1)
                    + " = " + nilaiMhs[i]);
          }
          
        System.out.println();
        System.out.println("Nilai Terbesar Adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil Adalah " + nilaiTerkecil);
        
        System.out.println();
        System.out.print("Petugas : " + petugas);
    }
}
