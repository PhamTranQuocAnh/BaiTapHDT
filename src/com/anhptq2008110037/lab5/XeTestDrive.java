/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab5;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe b = new Xe("Suzuki"); 
        System.out.println("Hãng Sản Xuất: " + b.hangSanXuat);
        System.out.println();

        Xe c = new Xe("Wachty", "Hayabusa"); 
        System.out.println("Tên Chủ Xe: " + c.tenChuXe);
        System.out.println("Tên xe: " + c.dongXe);
        System.out.println();

        Xe d = new Xe("Nhật Bản", "Moto", "Có giấy"); 
        System.out.println("Xuất Xứ: " + d.xuatXu);
        System.out.println("Dòng Xe: " + d.dongXe);
        System.out.println("Giấy Phép: " + d.giayPhep);
        System.out.println();
}
}
