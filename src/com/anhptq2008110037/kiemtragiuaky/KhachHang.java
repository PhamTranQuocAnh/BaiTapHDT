/*
*  crated date: 04 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.kiemtragiuaky;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private double triGiaHoaDon;
    @Override
    public String toString() {
        return "KhachHang [tenCongTy=" + tenCongTy + ", triGiaHoaDon=" + triGiaHoaDon + "]";
    }
    KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
}


