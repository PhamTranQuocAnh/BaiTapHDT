/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab5;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    int dungTichXang;
    String xuatXu;
    Xe() {
        System.out.println("Xe Hayabusa");
    }
    Xe(String hSx){
        hangSanXuat=hSx;
    }
    Xe(String tCX, String dX){
        tenChuXe=tCX;
        dongXe=dX;
    }
    Xe(String xX,String dX, String gP){
        xuatXu=xX;
        dongXe=dX;
        giayPhep=gP;
    }
}
