/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan5;

public class TaiKhoan {
    String soDu;
    String soTaiKhoan;
    String tenTaiKhoan;
    String diaChi;
    String tenNganHang;
    String namSinh;
    String ngayCapThe;
    TaiKhoan() {
        tenNganHang = "ViettinBank";
    }
    TaiKhoan(String ten) {
        tenTaiKhoan = ten;
    }
    TaiKhoan(String nS, String dc) {
        namSinh = nS;
        diaChi = dc;
    }
    TaiKhoan(String stk, String sD, String ngayCap) {
        soTaiKhoan = stk;
        soDu = sD;
        ngayCapThe = ngayCap;
    }
}