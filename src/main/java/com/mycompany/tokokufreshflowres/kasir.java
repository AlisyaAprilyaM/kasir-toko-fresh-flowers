/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokokufreshflowres;

/**
 *
 * @author UseR
 */

import java.util.Scanner;

public class kasir {

    private final Scanner input = new Scanner(System.in);

    private int bacaAngka(String pesan) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();

            try {
                return Integer.parseInt(teks);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka bulat yang benar!");
            }
        }
    }

    public void prosesKasir() {
        produk p = new produk();
        transaksi t = new transaksi();
        strukbunga s = new strukbunga();

        System.out.println("==================================");
        System.out.println("    SISTEM KASIR FRESH FLOWERS");
        System.out.println("==================================");

        System.out.print("Nama pelanggan : ");
        t.namaPelanggan = input.nextLine();

        p.tampilkanProduk();

        System.out.println();
        System.out.println("Contoh pilihan: 2,4,6");
        System.out.println("Masukkan 0 jika ingin membatalkan pilihan.");

        System.out.print("Pilih nomor produk sekaligus: ");
        String pilihan = input.nextLine().trim();

        if (pilihan.isEmpty() || pilihan.equals("0")) {
            System.out.println("Belum ada produk yang dipilih.");
            return;
        }

        String[] daftarPilihan = pilihan.split(",");
        boolean[] sudahDipilih = new boolean[p.namaBunga.length];

        for (String nomor : daftarPilihan) {
            int angka;

            try {
                angka = Integer.parseInt(nomor.trim());
            } catch (NumberFormatException e) {
                System.out.println("Pilihan tidak valid: " + nomor);
                return;
            }

            if (angka < 1 || angka > p.namaBunga.length) {
                System.out.println("Nomor produk " + angka
                        + " tidak tersedia!");
                return;
            }

            int indeks = angka - 1;

            if (sudahDipilih[indeks]) {
                System.out.println("Produk nomor " + angka
                        + " dipilih lebih dari sekali!");
                return;
            }

            sudahDipilih[indeks] = true;

            System.out.println("\nProduk: " + p.namaBunga[indeks]);
            System.out.println("Harga : Rp" + p.hargaBunga[indeks]);

            int jumlah = bacaAngka("Jumlah produk: ");

            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
                return;
            }

            t.tambahProduk(
                    p.namaBunga[indeks],
                    p.hargaBunga[indeks],
                    jumlah
            );
        }

        System.out.println("\nTotal belanja: Rp" + t.total);

        while (true) {
            t.bayar = bacaAngka("Uang dibayar (Rp): ");

            if (t.bayar < t.total) {
                System.out.println("Uang kurang Rp"
                        + (t.total - t.bayar));
            } else {
                break;
            }
        }

        t.hitungKembalian();
        s.tampilkanStruk(t);
    }
}
