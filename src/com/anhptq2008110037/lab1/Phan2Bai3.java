package com.anhptq2008110037.lab1;

import java.util.Scanner;
public class Phan2Bai3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của khối lập phương:");
        double dai = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng của khối lập phương:");
        double rong = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao của khối lập phương:");
        double cao = scanner.nextDouble();
        double theTichLapPhuong = dai*rong*cao;
        System.out.println("Thế Tích Khối Lập Phương là:"+theTichLapPhuong);
    }
}

