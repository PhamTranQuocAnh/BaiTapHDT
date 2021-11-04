/*
*  crated date: 04 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double giaTriHoaDon;
    
    KhachHang(String ten, String diaChi, String tenCongTy, Double giaTriHoaDon){
        super(ten, diaChi);
        this.tenCongTy = tenCongTy;
        this.giaTriHoaDon = giaTriHoaDon;
    };
    public double getGiaTriHoaDon() {
        return giaTriHoaDon;
    }
    public String getTenCongTy(){
        return tenCongTy;
    }

    @Override
    public String toString() {
        return super.toString() + " Tên công ty " + getTenCongTy() + " Giá trị hóa đơn" + getGiaTriHoaDon();
    }
}


