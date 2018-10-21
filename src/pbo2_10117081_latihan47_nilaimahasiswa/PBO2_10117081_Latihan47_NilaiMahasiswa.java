/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan47_nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Untuk menghitung dan memperlihatkan indeks nilai mahasiswa
 */
public class PBO2_10117081_Latihan47_NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        NilaiMhs nilai = new NilaiMhs();
        
        System.out.print("Masukkan nilai Quiz : ");
        double quiz = scn.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double uts = scn.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas = scn.nextDouble();
        System.out.println();
        
        double na = nilai.hitungNilaiAkhir(quiz, uts, uas);
        char indeks = nilai.hitungNilaiIndeks(na);
        String ket = nilai.keterangan(indeks);
        
        System.out.println("Nilai Akhir = " + na);
        System.out.println();
        
        System.out.println("Indeks = " + indeks);
        System.out.println("Keterangan = " + ket);
    }
}
