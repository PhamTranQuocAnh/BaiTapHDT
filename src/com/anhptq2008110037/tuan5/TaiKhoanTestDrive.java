/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan5;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan();
        System.out.println("Tên ngân hàng: " + tk.tenNganHang);
        System.out.println();

        TaiKhoan tk1 = new TaiKhoan("David Four");
        System.out.println("Tên khách hàng: " + tk1.tenTaiKhoan);
        System.out.println();

        TaiKhoan tk2 = new TaiKhoan("01/12/2002", "518/32 - Đồng Tháp");
        System.out.println("Ngày Sinh: " + tk2.namSinh);
        System.out.println("Địa chỉ: " + tk2.diaChi);
        System.out.println();

        TaiKhoan tk3 = new TaiKhoan("123546789", "10.000 VNĐ", "06/06/2016");
        System.out.println("Số tài khoản: " + tk3.soTaiKhoan);
        System.out.println("Số dư: " + tk3.soDu);
        System.out.println("Ngày cấp thẻ: " + tk3.ngayCapThe);
        System.out.println();

    }

}