package com.example.PH48214_02032025.Phan1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTinhTong {
    TinhTong sumOddNumbers = new TinhTong();

        @Test
        public void testCase1_AllValidOddNumbers() {
            int[] arr = {1, 3, 5, 7, 9};  // Toàn bộ là số lẻ hợp lệ
            assertEquals(25, sumOddNumbers.sumOddNumbers(arr));
        }

        @Test
        public void testCase2_ContainsEvenNumbers() {
            int[] arr = {2, 4, 6, 8, 10, 1, 3, 5};  // Chỉ cộng 1, 3, 5
            assertEquals(9, sumOddNumbers.sumOddNumbers(arr));
        }

        @Test
        public void testCase3_ContainsNumbersGreaterThan100() {
            int[] arr = {101, 150, 99, 3, 103};  // 101, 150, 103 bị bỏ qua → chỉ cộng 99 + 3
            assertEquals(102, sumOddNumbers.sumOddNumbers(arr));
        }

        @Test
        public void testCase4_ContainsNegativeAndZero() {
            int[] arr = {-1, -3, 0, 5, 99};  // Vẫn cộng số lẻ hợp lệ: -1, -3, 5, 99
            assertEquals(100, sumOddNumbers.sumOddNumbers(arr));
        }

        @Test
        public void testCase5_EmptyArray() {
            int[] arr = {};  // Mảng rỗng → tổng = 0
            assertEquals(0, sumOddNumbers.sumOddNumbers(arr));
        }
    }


