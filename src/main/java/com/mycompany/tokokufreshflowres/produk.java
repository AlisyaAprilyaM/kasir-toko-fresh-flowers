/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokokufreshflowres;

/**
 *
 * @author UseR
 */

public class produk {

    public String[] namaBunga = {
        "Buket Bunga",
        "Bunga Mawar",
        "Bunga Tulip",
        "Bunga Matahari",
        "Bunga Lily",
        "Kertas Buket",
        "Kertas Buket Premium",
        "Kartu Ucapan",
        "Plastik Transparan",
        "Boneka Mini",
        "Bunga Baby Breath",
        "Pita Satin",
        "Wrapping Transparan",
        "Tas Buket",
        "Lampu LED Buket"
    };

    public int[] hargaBunga = {
        45000, 7000, 5000,
        7000, 3000, 5000,
        2000, 3000, 7000,
        5000, 3000, 4000,
        4000, 7000, 7000
    };

    public void tampilkanProduk() {
        System.out.println("\nDAFTAR PRODUK FRESH FLOWERS");
        System.out.println("========================================");

        for (int i = 0; i < namaBunga.length; i++) {
            System.out.println((i + 1) + ". "
                    + namaBunga[i] + " - Rp" + hargaBunga[i]);
        }

        System.out.println("========================================");
    }
}

