package com.logical_test2.soal;

import java.util.Scanner;

public class SegitigaBintang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menghasilkan pola segitiga terbalik
        printInvertedTriangle(n);
    }

    public static void printInvertedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Mencetak spasi sebelum bintang
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
