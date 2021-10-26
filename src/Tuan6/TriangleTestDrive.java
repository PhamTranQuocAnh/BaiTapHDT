/*
*  crated date: 26 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package Tuan6;

public class TriangleTestDrive {
        public static void main(String[] args) {
            
            Triangle triangle = new Triangle(true, "hinhTamGiac.AIF");
    
            System.out.println("Hình có được nhấp chuột: "+triangle.nhapChuot);
    
            System.out.println("Số lần nhấp chuột: "+Triangle.soLanNhapChuot);
    
            triangle.xoay();
    
            System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+triangle.amThanh);
    
            triangle.phatAmThanh();
        }
    }