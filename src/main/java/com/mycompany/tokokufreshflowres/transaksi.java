/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokokufreshflowres;

/**
 *
 * @author UseR
 */

import java.util.ArrayList;

public class transaksi {

    public String namaPelanggan;
    public String nomorTelepon;

    public ArrayList<String> namaProduk = new ArrayList<>();
    public ArrayList<Integer> hargaProduk = new ArrayList<>();
    public ArrayList<Integer> jumlahProduk = new ArrayList<>();
    public ArrayList<Integer> subtotalProduk = new ArrayList<>();

    public int total;
    public int bayar;
    public int kembalian;

    // Menambahkan produk ke dalam transaksi
    public void tambahProduk(String nama, int harga, int jumlah) {
        namaProduk.add(nama);
        hargaProduk.add(harga);
        jumlahProduk.add(jumlah);
        subtotalProduk.add(harga * jumlah);

        total += harga * jumlah;
    }

    // Menghitung uang kembalian
    public void hitungKembalian() {
        kembalian = bayar - total;
    }
}

