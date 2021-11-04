/*
*  crated date: 04 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.kiemtragiuaky;
import java.util.ArrayList;

public class DanhSachQuanLi {
    private ArrayList<Nguoi> danhSach;

    DanhSachQuanLi(){
        danhSach = new ArrayList<Nguoi>();
    }

    DanhSachQuanLi(ArrayList<Nguoi> danhSach) {
        this.danhSach = danhSach;
    }
    public void themNguoi(Nguoi ng) {
        this.danhSach.add(ng);
    }

    public void inDanhSachQuanLi() {
        for (Nguoi nguoi : danhSach) {
            System.out.println(nguoi);
        }
    }


}