/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan47_nilaimahasiswa;

/**
 *
 * @author Geo Syah Alkautsar
 */
class NilaiMhs {
    private double nAkhir;
    private char indeks;
    
    public double hitungNilaiAkhir(double quiz, double uts, double uas) {
        nAkhir = (0.20 * quiz) + (0.30 * uts) + (0.50 * uas);
        return nAkhir;
    }
    
    public char hitungNilaiIndeks(double na) {
        if(80 <= na && na <= 100) {
            indeks = 'A';
            return indeks;
        } else if(68 <= na && na < 80) {
            indeks = 'B';
            return indeks;
        } else if(56 <= na && na < 68) {
            indeks = 'C';
            return indeks;
        } else if(45 <= na && na < 56) {
            indeks = 'D';
            return indeks;
        } else {
            indeks = 'E';
            return indeks;
        }
    }
    
    public String keterangan(char indeks) {
        String ket;
        switch(indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            default:
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }

}
