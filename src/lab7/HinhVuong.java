/*
*  crated date: 03 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package lab7;

public class HinhVuong extends HinhChuNhat{

    HinhVuong(double a) {
        super(a, a);
    }
    public void xuatRaManHinh() {
        System.out.println("Diện tích hình vuông là: " + getDienTich());
    }
}
