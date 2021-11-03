/*
*  crated date: 28 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.Tuan7.Inheritance.Animal;

import java.security.ProtectionDomain;

public class Dog extends Animal{
    protected String picture = "Hình dạng của con chó";
    protected String food = "Thịt";
    protected int hunger = "10";
    protected int location ="x,y";
    
    
    protected void makeNoise(){
        System.out.println("Gâu Gâu !!");
    }
    protected void eat(){
        System.out.println("Đang ăn");
    }
    protected void sleep(){
        System.out.println("zZzZzZz");
    }
    protected void walk(){

        System.out.println("Đuổi theo con mèo");
    }

    
}
