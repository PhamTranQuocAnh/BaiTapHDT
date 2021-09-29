/*
*  crated date: 29 thg 9, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab2;

import java.util.Scanner;

public class Phan2Bai4 {
    public static void main(String[] args) {
        int giaTriNhap;
        do{
        System.err.println("==========MENU=========");
        System.err.println("1. Giải Phương Trình Bậc 1");
        System.err.println("2. Giải Phương Trình Bậc 2");
        System.err.println("3. Tính tiền điện");
        System.err.println("4. Kết thúc");
        System.err.println("===========END=========");
        System.err.println("Hãy chọn 1 chức năng:");
        Scanner bienNhap = new Scanner(System.in);
         giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap){
            case 1:System.out.println("-Giải Phương Trình Bậc 1-");
                System.out.print("Nhập a: ");
                double a = bienNhap.nextDouble();
                System.out.print("Nhập b: ");
                double b = bienNhap.nextDouble();
                giaiPhuongTrinhBacNhat(a, b); break;
            case 2:System.out.println("-Giải Phương Trình Bậc 2-");
                System.out.print("Nhập a: ");
                double z = bienNhap.nextDouble();
                System.out.print("Nhập b: ");
                double x = bienNhap.nextDouble();
                System.out.print("Nhập c: ");
                double c = bienNhap.nextDouble();
                giaiPhuongTrinhBacHai(z,x,c); break;
            case 3:System.out.println("-Tính Tiền Điện-");
                System.out.print("Nhập số điện đã sử dụng: ");
                double soDien = bienNhap.nextDouble();
                tinhTienDien(soDien); break;
            case 4: System.out.println("Kết thúc"); break;
            default: System.out.println("Không hợp lệ. Chọn từ 1 đến 4");

        }

        }
    while (giaTriNhap != 4);
    }
    static void giaiPhuongTrinhBacNhat(double a, double b){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô sô nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double nghiem = (double) - b / a;
            System.out.println("Phương trình có nghiệm: ");
            System.out.printf("%.2f", nghiem);
        }
    }
    
    
    
    static void giaiPhuongTrinhBacHai(double a, double b, double c){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
// tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
// tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
   
   
    static void tinhTienDien(double soDien){
        double tienDien;
        if(soDien <= 50)
        {
            tienDien = soDien*1000;
            System.out.print("Tiền điện cần trả: " + tienDien);
            System.out.println(" đồng");
        } 
        else if(soDien > 50)
        {
            tienDien = 50*1000 + (soDien - 50)*1200;
            System.out.print("Tiền điện cần trả: " + tienDien);
            System.out.println(" đồng");
        }
        else{
            System.out.println("Nhập sai vui lòng nhập lại số điện đã sử dụng");
        }
    } 
}





