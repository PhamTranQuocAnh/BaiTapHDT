/*
*  crated date: 04 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.kiemtragiuaky;
import java.util.Scanner;
public class Nguoi {
    private String hoTen;
    private String diaChi;

    Nguoi(){};
    Nguoi(String hoTen, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return "Họ tên: " + hoTen + " Địa Chỉ:  " + diaChi;
    }
}