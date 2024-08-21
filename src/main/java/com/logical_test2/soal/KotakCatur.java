package com.logical_test2.soal;

public class KotakCatur {
    public static void main(String[] args){
        int size = 10;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Logika yang benar untuk menghasilkan pola catur
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
