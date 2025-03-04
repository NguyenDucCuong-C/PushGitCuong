package com.example.CuongPh54612.sum;

public class SumChan {
    public static int SumBoChiaHet8(int n) {


        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("Nhập trong khoảng 1-50");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 8 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
