/*
*  crated date: 14 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab5;
public class Cow {
    // attribute
    double weight;
    double age;
    Cow (){
        weight = 15;
        age = 1;
    }
    Cow (double w){
        weight = w;
        age = 2;
    }
    Cow (double w, double a){
        weight = w;
        age = a;
    }
    void inThongTin (){
        System.out.print("Cân Nặng :" + weight);
        System.out.println(" kg");
        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");
    }
    void moo(){
        System.out.println("Be be be");
    }
    
}