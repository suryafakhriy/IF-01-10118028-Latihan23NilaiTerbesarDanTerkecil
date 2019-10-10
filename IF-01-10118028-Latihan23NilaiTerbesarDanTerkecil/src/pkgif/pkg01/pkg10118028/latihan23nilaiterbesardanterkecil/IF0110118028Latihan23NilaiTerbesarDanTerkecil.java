/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan23nilaiterbesardanterkecil;
    import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI :Nilai Terbesar Dan Terkecil
 */
public class IF0110118028Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int jumlahMhs;
        int[] nilaiMhs = new int[10];
        int terbesar = 0;
        int terkecil = 100;
        
        //input 
        System.out.println("++++++++++PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA++++++++++");
        System.out.print("Masukkan nama petugas : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        Scanner tempJmlh = new Scanner(System.in);
        jumlahMhs =  tempJmlh.nextInt();
        
        //proses
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            if(nilaiMhs[i] > terbesar ){
                 terbesar = nilaiMhs[i];
            } 
           if(nilaiMhs[i] < terkecil){
               terkecil = nilaiMhs[i];
           }
                  
        }
          System.out.println();
        //output
        System.out.println("++++++HASIL NILAI MAHASISWA++++++");
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.println("Nilai Mahasiswa Ke - " + i + " = " + nilaiMhs[i]);
            
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah\t: " + terbesar);
        System.out.println("Nilai Terkecil adalah   : "  + terkecil);
        System.out.println();
        System.out.println("Petugas : " + nama);
        
        
                
    }
    
}
