package com.example.PH48214_02032025.Phan2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class KhachHangTest {

        private KhachHangService khachHangService;

        @BeforeEach
        public void setUp() {
            khachHangService = new KhachHangService();
            khachHangService.addKhachHang(new KhachHang("A1", "Hoang", 33, "Hoang@gmail.com", "032999201"));
            khachHangService.addKhachHang(new KhachHang("A2", "Lan", 28, "Lan@gmail.com", "032999202"));
            khachHangService.addKhachHang(new KhachHang("A3", "Tuan", 30, "Tuan@gmail.com", "032999203"));
        }

        @Test
        public void testTimKiemKhachHang_TonTai() {
            KhachHang result = khachHangService.timKiemKhachHang("Hoang");
            assertNotNull(result);
            assertEquals("Hoang", result.getTenKH());
        }

        @Test
        public void testTimKiemKhachHang_KhongTonTai() {
            KhachHang result = khachHangService.timKiemKhachHang("Nguyen");
            assertNull(result);
        }

        @Test
        public void testTimKiemKhachHang_NhapRong() {
            KhachHang result = khachHangService.timKiemKhachHang("");
            assertNull(result);
        }

        @Test
        public void testTimKiemKhachHang_NhapNull() {
            KhachHang result = khachHangService.timKiemKhachHang(null);
            assertNull(result);
        }

        @Test
        public void testTimKiemKhachHang_KhongPhanBietChuHoaChuThuong() {
            KhachHang result = khachHangService.timKiemKhachHang("hoang");
            assertNotNull(result);
            assertEquals("Hoang", result.getTenKH());
        }
    }



