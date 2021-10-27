/*
*  crated date: 27 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package Tuan7.Inheritance.Shape;

public class Amoeba extends Shape {

    private String nameFile;
    private int toaDoX;
    private int toaDoY;

    Amoeba(String n, int x, int y) {
        nameFile = n;
        toaDoX = x;
        toaDoY = y;
    }

    protected void hinhDang() {
        System.out.println("Đây là một hình kiểu Amoeba");
    }

    protected void xoay() {
        System.out.printf("Hình quay theo tọa độ x = " + toaDoX + " và y = " + toaDoY + "\n");
    }

    protected void soud() {
        System.out.println("Mở file âm thanh: " + nameFile);
    }
}