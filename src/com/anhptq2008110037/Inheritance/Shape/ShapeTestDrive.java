/*
*  crated date: 27 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.Inheritance.Shape;

import java.sql.Time;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Amoeba amoeba = new Amoeba(".hif",12 , 20);
    
    circle.hinhDang();
    circle.xoay();
    circle.soud();
    circle.playMusic();
    System.out.println();

    triangle.hinhDang();
    triangle.xoay();
    triangle.soud();
    triangle.playMusic();
    System.out.println();

    square.hinhDang();
    square.xoay();
    square.soud();
    square.playMusic();
    System.out.println();

    amoeba.hinhDang();
    amoeba.xoay();
    amoeba.soud();
    amoeba.playMusic();
    }
}