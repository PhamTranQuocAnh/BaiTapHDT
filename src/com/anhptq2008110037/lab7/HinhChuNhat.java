/*
*  crated date: 03 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab7;

public class HinhChuNhat {
    private double rong;
    private double dai;
    private double chuVi;
    private double dienTich;

    HinhChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }
    private double setChuVi(){
        chuVi = (dai + rong) * 2;
        return chuVi;
    }

    public double getChuVi(){
        return setChuVi();
    }

    private double setDienTich(){
        dienTich = (dai * rong);
        return dienTich;
    }

    public double getDienTich(){
        return setDienTich();
    }

    public void xuatRaManHinh(){
        System.out.println("Chu vi 2 cạnh là: " + getChuVi());
        System.out.println("Diện tích 2 cạnh là: " + getDienTich());
    }

}