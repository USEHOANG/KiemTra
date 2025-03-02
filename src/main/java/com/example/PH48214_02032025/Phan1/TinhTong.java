package com.example.PH48214_02032025.Phan1;

public class TinhTong {
        public static int sumOddNumbers(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                if (num <= 100 && num % 2 != 0) {
                    sum += num;
                }
            }
            return sum;
        }
}
