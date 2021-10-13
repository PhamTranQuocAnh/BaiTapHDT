/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab5;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        System.out.println("Năm bảo hành: " + mt.namBaoHanh);
        System.out.println();

        MayTinh mt1 = new MayTinh("19.000.000 VNĐ");
        System.out.println("Giá tiền: " + mt1.gia);
        System.out.println();

        MayTinh mt2 = new MayTinh("Asus", "2021");
        System.out.println("Nhà sản xuất: " + mt2.tenNhaSanXuat);
        System.out.println("Năm sản xuất: " + mt2.namSanXuat);
        System.out.println();

        MayTinh mt3 = new MayTinh("Window 10", "Intel Core i5-11300H", "8 GB, 3200MHz");
        System.out.println("Hệ điều hành: " + mt3.heDieuHanh);
        System.out.println("CPU: " + mt3.cpu);
        System.out.println("RAM: " + mt3.ram);
        System.out.println();
    }

}