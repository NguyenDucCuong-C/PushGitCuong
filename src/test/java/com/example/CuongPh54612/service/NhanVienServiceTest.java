package com.example.CuongPh54612.service;

import com.example.CuongPh54612.entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {


    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();

        nhanVienService.addNhanVien(new NhanVien("nv001", "a", 18, 3.4f, 5, "UDPM"));
        nhanVienService.addNhanVien(new NhanVien("nv002", "f", 19, 4.4f, 5, "UDPM"));
        nhanVienService.addNhanVien(new NhanVien("nv003", "d", 20, 5.4f, 5, "UDPM"));
    }

    @Test
    void updateNhanVien() {
        NhanVien nhanVien = nhanVienService.findByMa("nv001");
        System.out.println(nhanVien.toString());

        NhanVien nvMoi = new NhanVien("nv001", "hh", 18, 3.4f, 5, "UDPM");

        nhanVienService.updateNhanVien(nvMoi);

        NhanVien nvUp = nhanVienService.findByMa("nv001");

        assertEquals(nvMoi, nvUp);
    }


    @Test
    void updateNhanVienTrong() {
        NhanVien nvMoi = new NhanVien("", "a", 18, 3.4f, 5, "UDPM");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> nhanVienService.updateNhanVien(nvMoi));

        assertEquals("Không được để trống", exception.getMessage());
    }

    @Test
    void updateNhanVienTuoiBienDuoi() {
        NhanVien nvMoi = new NhanVien("nv001", "a", 17, 3.4f, 5, "UDPM");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> nhanVienService.updateNhanVien(nvMoi));

        assertEquals("Nhập sai dữ liệu", exception.getMessage());
    }

    @Test
    void updateNhanVienTuoiBienTren() {
        NhanVien nvMoi = new NhanVien("nv001", "a", 51, 3.4f, 5, "UDPM");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> nhanVienService.updateNhanVien(nvMoi));

        assertEquals("Nhập sai dữ liệu", exception.getMessage());
    }

    @Test
    void updateNhanVienKhongTonTai() {
        NhanVien nvMoi = new NhanVien("nv0011111", "a", 18, 3.4f, 5, "UDPM");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> nhanVienService.updateNhanVien(nvMoi));

        assertEquals("Không tìm thấy mã nhân viên", exception.getMessage());
    }


}