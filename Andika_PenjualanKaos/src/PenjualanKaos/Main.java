/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanKaos;

import java.util.Scanner;

/**
 *
 * @author Andika Dewa
 */
public class Main {

    public static void main(String[] args) {

        String nama, size;
        int umur, pilihan;
        int jumlah1, jumlah2, jumlah3, jumlah4;
        int total1, total2, total3, total4;

        Scanner input = new Scanner(System.in);

        //Objek
        TokoKaos toko = new TokoKaos();
        //method setter dan getter
        toko.setJudul("------------- TOKO KAOS NGALAM -------------");
        toko.getJudul();

        //Pengisian data diri
        System.out.println("------------ ISI DATA DIRI ANDA ------------");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Size baju : ");
        size = input.next();

        System.out.println("------------------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Size : " + size);
        System.out.println("------------------------------------");

        System.out.println("Pilihan motif kaos :");
        toko.setMotif("1. Batik (Rp. 90.000)\n2. Bercak (Rp. 85.000)\n3. Logo Brand(Rp. 40.000)\n4. Polos(Rp. 30.000)");
        toko.getMotif();

        System.out.println("------------------------------------");
        System.out.print("Pilihan Anda : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("------------------------------------");
                System.out.print("Jumlah barang yang akan dibeli      : ");
                jumlah1 = input.nextInt();
                System.out.println("------------------------------------");
                total1 = 90000 * jumlah1;
                System.out.println("Harga Akhir : Rp. " + total1);
                System.out.println("------------------------------------");
                toko.setPenutup("TERIMAKASIH");
                toko.getPenutup();
                break;
            case 2:
                System.out.println("------------------------------------");
                System.out.print("Jumlah barang yang akan dibeli      : ");
                jumlah2 = input.nextInt();
                System.out.println("------------------------------------");
                total2 = 85000 * jumlah2;
                System.out.println("Harga Akhir : Rp. " + total2);
                System.out.println("------------------------------------");
                toko.setPenutup("TERIMAKASIH");
                toko.getPenutup();
                break;
            case 3:
                System.out.println("------------------------------------");
                System.out.print("Jumlah barang yang akan dibeli      : ");
                jumlah3 = input.nextInt();
                System.out.println("------------------------------------");
                total3 = 40000 * jumlah3;
                System.out.println("Harga Akhir : Rp. " + total3);
                System.out.println("------------------------------------");
                toko.setPenutup("TERIMAKASIH");
                toko.getPenutup();
                break;
            case 4:
                System.out.println("------------------------------------");
                System.out.print("Jumlah barang yang akan dibeli      : ");
                jumlah4 = input.nextInt();
                System.out.println("------------------------------------");
                total4 = 30000 * jumlah4;
                System.out.println("Harga Akhir : Rp. " + total4);
                System.out.println("------------------------------------");
                toko.setPenutup("TERIMAKASIH");
                toko.getPenutup();
                break;
            default:
                System.out.println("------------------------------------");
                System.out.println("Sepertinya anda masuk toko sepatu, pilihan anda tidak ada");
                System.out.println("------------------------------------");
                toko.setPenutup("TERIMAKASIH");
                toko.getPenutup();

        }

    }
}
