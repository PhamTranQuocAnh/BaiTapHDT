/*
*  crated date: 29 thg 9, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab3;

import java.util.Scanner;

public class Phan1Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số a để kiểm tra có phải là số nguyên tố: ");
        int a = in.nextInt();
        boolean ok = true;
        for (int i = 2;i<a;i++)
            if(a%i==0)
            {
                ok = false;
                break;
            }
        if(ok==true)
            System.out.println("Đây là số nguyên tố ");
        else
            System.out.println("Đây không là số nguyên tố ");
    }
}