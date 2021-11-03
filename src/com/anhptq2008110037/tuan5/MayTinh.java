/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan5;

public class MayTinh {
        String tenNhaSanXuat;
        String namSanXuat;
        String heDieuHanh;
        String ram;
        String cpu;
        String gia;
        String namBaoHanh;
        MayTinh() {
            namBaoHanh = "2 năm";
        }
        MayTinh(String g) {
            gia = g;
        }
        MayTinh(String nsx, String n) {
            tenNhaSanXuat = nsx;
            namSanXuat = n;
        }
        MayTinh(String hdh, String c, String r) {
            heDieuHanh = hdh;
            cpu = c;
            ram = r;
        }
    
    }