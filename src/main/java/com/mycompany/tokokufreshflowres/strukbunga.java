/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokokufreshflowres;

/**
 *
 * @author UseR
 */
public class strukbunga {

    public void tampilkanStruk(transaksi t) {

        System.out.println();
        System.out.println("================================================");
        System.out.println("              TOKO FRESH FLOWERS");
        System.out.println("                 STRUK PEMBAYARAN");
        System.out.println("================================================");

        System.out.println("Nama pelanggan : " + t.namaPelanggan);
     
        System.out.println("------------------------------------------------");
        System.out.printf("%-25s %6s %12s%n",
                "Nama produk", "Jumlah", "Subtotal");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < t.namaProduk.size(); i++) {

            System.out.printf("%-25s %6d Rp%10d%n",
                    t.namaProduk.get(i),
                    t.jumlahProduk.get(i),
                    t.subtotalProduk.get(i));
        }

        System.out.println("------------------------------------------------");
        System.out.printf("%-32s Rp%,d%n", "TOTAL BELANJA", t.total);
        System.out.printf("%-32s Rp%,d%n", "UANG DIBAYAR", t.bayar);
        System.out.printf("%-32s Rp%,d%n", "KEMBALIAN", t.kembalian);

        System.out.println("STATUS PEMBAYARAN: LUNAS");
        System.out.println("================================================");
        System.out.println("     Terima kasih telah berbelanja!");
        System.out.println("         Di Toko Fresh Flowers");
        System.out.println("================================================");
    }
}
