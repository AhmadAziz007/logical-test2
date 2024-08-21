package com.logical_test2.soal;

import java.util.Scanner;

public class aritmetika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int input = scanner.nextInt();

        scanner.close();

        // Menghasilkan deret
        generateSeries(input);
    }

    public static void generateSeries(int n) {
        int start = 1; // Elemen pertama dari deret
        int diff = 2;  // Selisih awal

        // Menampilkan deret
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += diff; // Menambahkan selisih ke elemen saat ini
            diff += 2;     // Meningkatkan selisih untuk iterasi berikutnya
        }
        System.out.println(); // Pindah ke baris berikutnya setelah selesai
    }
}
