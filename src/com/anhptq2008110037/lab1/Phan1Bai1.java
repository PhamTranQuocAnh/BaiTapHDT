package com.anhptq2008110037.lab1;

import java.util.Scanner;
public class Phan1Bai1 {
public static void main(String[] args) {
        Scanner dieuKhien;
        dieuKhien = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = dieuKhien.nextLine();
        System.out.print("Điểm TB: "); 
        double diemTB = dieuKhien.nextDouble();   
        System.out.printf("%s %f điểm", hoTen, diemTB);   
        }
    }
    

