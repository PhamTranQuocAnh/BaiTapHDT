/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan5;

public class NhanVienTestDrive {
    
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(); 
        System.out.println("Địa điểm kinh doanh: " + nv1.diaChi);
        System.out.println();
        
        NhanVien nv2 = new NhanVien("Phục Vụ"); 
        System.out.println("Bộ phận làm việc: " + nv2.boPhanLamViec);
        System.out.println();

        NhanVien nv3 = new NhanVien("Uncle Phục", "20/12/1998"); 
        System.out.println("Tên Nhân Viên: " + nv3.tenNhanVien);
        System.out.println("Ngày sinh: " + nv3.ngaySinh);
        System.out.println();

        NhanVien nv4 = new NhanVien("Uncle Phục", "Pha Chế", "12.000.000"); 
        System.out.println("Tên Nhân Viên: " + nv4.tenNhanVien);
        System.out.println("Bộ Phận Làm Việc: " + nv4.boPhanLamViec);
        System.out.println("Lương: " + nv4.tienLuong);
        System.out.println();

}
}
