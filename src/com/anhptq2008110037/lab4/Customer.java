/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab4;

public class Customer {
    String name;
    int namSinh;
    String gioiTinh;
    
    Customer (String a, int b, String c)
    {
        name = a;
        namSinh = b;
        gioiTinh = c;

    }

    void getName () {
        System.out.println("Tên Khách Hàng: " + name );
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
    
}