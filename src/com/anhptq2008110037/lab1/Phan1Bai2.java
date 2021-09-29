package com.anhptq2008110037.lab1;

import java.util.Scanner;
public class Phan1Bai2 {
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chiều dài của hình chữ nhật:");
            double dai = scanner.nextDouble();
            System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
            double rong = scanner.nextDouble();
            double chuVi = (dai + rong)*2;
            System.out.println("Chu vi hình chữ nhật là:"+chuVi);
            double dienTich = dai*rong;
            System.out.println("Diện tích hình chữ nhật là:"+dienTich);
            double canhNhoNhat = Math.min(dai,rong);
            System.out.println("Cảnh nhỏ nhất hình chữ nhật là:"+canhNhoNhat);
            System.out.println("------------------------------------------");
        }
    }
    