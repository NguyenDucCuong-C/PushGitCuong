package com.example.CuongPh54612.service;

import com.example.CuongPh54612.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    List<NhanVien> nhanViens = new ArrayList<>();


    public void validateNhanVien(NhanVien nv) {
        if (nv.getMaNV() == null || nv.getMaNV().trim().isEmpty() ||
                nv.getTen() == null || nv.getTen().trim().isEmpty() ||
                nv.getPhongBan() == null || nv.getPhongBan().trim().isEmpty()) {
            throw new IllegalArgumentException("Không được để trống");
        }
        if (nv.getTuoi() < 18 || nv.getTuoi() > 50 ||
                nv.getLuong() < 0.0f || nv.getLuong() > 10.0f ||
                nv.getSoNamLamViec() < 0 || nv.getSoNamLamViec() > 10) {
            throw new IllegalArgumentException("Nhập sai dữ liệu");
        }
    }

    public void addNhanVien(NhanVien nv) {
        nhanViens.add(nv);
    }

    public void updateNhanVien(NhanVien nv) {
        validateNhanVien(nv);
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).getMaNV().equals(nv.getMaNV())) {
                nhanViens.set(i, nv);
                return;
            }
        }

        throw new IllegalArgumentException("Không tìm thấy mã nhân viên");
    }

    public NhanVien findByMa(String ma) {
        for (NhanVien vien : nhanViens) {
            vien.getMaNV().equals(ma);
            return vien;
        }

        throw new IllegalArgumentException("Không tìm thấy mã nhân viên");
    }

}
