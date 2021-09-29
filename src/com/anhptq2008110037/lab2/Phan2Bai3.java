/*
*  crated date: 29 thg 9, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab2;
import java.util.Scanner;

public class Phan2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số tiền điện của tháng là: ");
        Double soDien= scanner.nextDouble();
                
        if(soDien<=50)
        {
            Double tienDien= soDien*1000;
            System.out.print("Tien dien can tra: "+tienDien);
            System.out.println("Dong");
        }
        else if(soDien>50)
        {
            Double tienDienCoVuotMuc=50*1000+(soDien-50)*1200;
            System.out.print("Tien dien can tra: "+tienDienCoVuotMuc);
            System.out.println("Dong");
        }
        else 
        System.out.println("Nhap sai vui long nhap lai so dien da su dung");
    }
}
