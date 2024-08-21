package com.logical_test2.soal;

public class ContohKalimat {
    public static void main(String[] args) {
        String input = "Aku adalah anak gembala selalu riang serta gembira karena aku rajin bekerja tak pernah lelah ataupun gundah";
        int maxLineLength = 35; // Maksimal 35 karakter per baris

        // Split kalimat menjadi kata-kata
        String[] words = input.split(" ");
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            // Cek apakah menambahkan kata ini melebihi panjang maksimal
            if (line.length() + word.length() + 1 > maxLineLength) {
                // Jika iya, cetak baris saat ini dan mulai baris baru
                System.out.println(line.toString().trim());
                line = new StringBuilder();
            }
            // Tambahkan kata ke baris saat ini
            line.append(word).append(" ");
        }
        // Cetak baris terakhir
        if (line.length() > 0) {
            System.out.println(line.toString().trim());
        }
    }
}
