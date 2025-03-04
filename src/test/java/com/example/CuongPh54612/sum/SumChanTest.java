package com.example.CuongPh54612.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumChanTest {

    @Test
    void sumBoChiaHet8() {
        assertEquals(1107, SumChan.SumBoChiaHet8(50));
    }


    @Test
    void sumBoChiaHet8BienDuoi() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SumChan.SumBoChiaHet8(-1));

        assertEquals("Nhập trong khoảng 1-50", exception.getMessage());
    }


    @Test
    void sumBoChiaHet8BienTren() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SumChan.SumBoChiaHet8(51));

        assertEquals("Nhập trong khoảng 1-50", exception.getMessage());
    }


    @Test
    void sumBoChiaHet8So1() {
        assertEquals(1, SumChan.SumBoChiaHet8(1));
    }


    @Test
    void sumBoChiaHet8So49() {
        assertEquals(1057, SumChan.SumBoChiaHet8(49));
    }


}