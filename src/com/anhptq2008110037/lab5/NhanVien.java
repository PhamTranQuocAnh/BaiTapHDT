/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab5;

public class NhanVien {
    String tenNhanVien;
    String tienLuong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
NhanVien(){
    diaChi="666 - Sóc Trăng";
}
NhanVien(String bplv){
    boPhanLamViec=bplv;
}
NhanVien(String tnv, String ns){
    tenNhanVien=tnv;
    ngaySinh=ns;
}
NhanVien(String tnv, String tl, String bplv){
    tenNhanVien=tnv;
    tienLuong = tl;
    boPhanLamViec=bplv;

}
}

