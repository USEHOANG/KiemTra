package com.example.PH48214_02032025.Phan2;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {


        private List<KhachHang> danhSachKhachHang = new ArrayList<>();

        public void addKhachHang(KhachHang khachHang) {
            danhSachKhachHang.add(khachHang);
        }

        public KhachHang timKiemKhachHang(String tenKH) {
            if (tenKH == null || tenKH.trim().isEmpty()) {
                return null;
            }
            for (KhachHang kh : danhSachKhachHang) {
                if (kh.getTenKH().equalsIgnoreCase(tenKH)) {
                    return kh;
                }
            }
            return null;
        }


}
