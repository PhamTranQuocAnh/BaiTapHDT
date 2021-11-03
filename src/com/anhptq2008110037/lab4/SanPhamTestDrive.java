/*
*  crated date: 03 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab4;
import java.util.ArrayList;
public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.setTenSanPham("Áo");
        sp1.setDonGia("65.0000");
        sp1.setGiamGia(5);
        sp1.xuatThongTin();
        System.out.println();
        
        SanPham sp2 = new SanPham();
        sp2.setTenSanPham("Quần");
        sp2.setDonGia("120.0000");
        sp2.setGiamGia(3);
        sp2.xuatThongTin();
        System.out.println();
    
        
        SanPham sp3 = new SanPham("Balo", 99.0000, 5);
        SanPham sp4 = new SanPham("Giày", 150.000);
        sp3.xuatThongTin();
        System.out.println();
        sp4.xuatThongTin();
        System.out.println();
        

        ArrayList<SanPham> list = new ArrayList<>();
        SanPham sp5 = new SanPham("Dép", 150000);
        SanPham sp6 = new SanPham("Áo thun", 250000);
        SanPham sp7 = new SanPham("Quần", 350000);
        SanPham sp8 = new SanPham("Váy", 450000);
        SanPham sp9 = new SanPham("Túi xách", 550000);

        list.add(sp5);
        list.add(sp6);
        list.add(sp7);
        list.add(sp8);
        list.add(sp9);
     

        for (SanPham spm : list)
            spm.xuatThongTin();
    
    
    
    
    }
    
}
