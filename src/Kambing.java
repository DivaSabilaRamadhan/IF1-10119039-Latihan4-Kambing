/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  : Diva Sabila Ramadhan
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program tambah kambing
 */
public class Kambing {

    public void tambahKambing(){
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        
    }
    public static void main(String[] args) {
        Kambing kambingjantan = new Kambing();
        kambingjantan.tambahKambing();
    }
    
}
