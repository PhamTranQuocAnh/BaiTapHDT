/*
*  crated date: 14 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.Tuan6;


public class Triangle {
    //attribute
    boolean nhapChuot;
    String amThanh;
    public static int soLanNhapChuot;//biến static; biến class
    //method
    void xoay(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }
    void phatAmThanh(){
        System.out.println("Cạch Cạch");
    }
    // method - function tạo - contructor có nhiều tham số
    Triangle(boolean n, String s){
        nhapChuot = n;
        amThanh = s;
        soLanNhapChuot++;
    }
}