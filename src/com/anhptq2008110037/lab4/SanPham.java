/*
*  crated date: 03 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab4;

import javax.print.attribute.standard.DocumentName;
import javax.security.auth.callback.TextInputCallback;

public class SanPham {
    private String tenSanPham;
    private double donGia;
    private double giamGia;
    private double tienGiamGia;
    private double thueThuNhap;
    private double giaSauCung;
    
    SanPham(){

    }

    public SanPham(String t, int d ){
        this.tenSanPham = t;
        this.donGia     = d;
    }
    public SanPham(String t, int d, int g){
        this.tenSanPham = t;
        this.donGia     = d;
        this.giamGia   = g;
    }
    public void setTenSanPham(String tenSanPham){
        this.tenSanPham = tenSanPham;
    }
    public double getTenSanPham() {
        return tenSanPham;
    }
    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getTienGiamGia() {
        return tienGiamGia;
    }

    public void setTienGiamGia(double tienGiamGia) {
        this.tienGiamGia = tienGiamGia;
    }

    public double getThueThuNhap() {
        return thueThuNhap;
    }

    public void setThueThuNhap(double thueThuNhap) {
        thueThuNhap = donGia * 0.1;
        this.thueThuNhap = thueThuNhap;
    }

    public double getGiaSauCung() {
        return giaSauCung;
    }

    public void setGiaSauCung(double giaSauCung) {
        tienGiamGia = (donGia / 100) * giamGia;
        giaSauCung = donGian - (tienGiamGia + getThueThuNhap());
        this.giaSauCung = giaSauCung;
    }
    
    public void xuatThongTin(){
        System.out.println("Tên sản phẩm: " + getTenSanPham());
        System.out.printf("Giá sản phẩm: " +" %.0f" + " VNĐ\n" , getDonGia());
        System.out.println("Giảm giá: " + getGiamGia() + " %");
        System.out.println("Thuế 10% giá bán");
        System.out.printf("Giá sau cùng " + "%.0f" + " VNĐ\n", getTienSauCung());
        System.out.println();
    }
    } 
    
}
