/*
*  crated date: 14 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan5;

public class CowTestDrive {
    public static void main (String[] args){
        Cow cow;
        cow = new Cow();
        cow.inThongTin();
        cow.moo();
        cow = new Cow (10);
        cow.inThongTin();
        cow.moo();
        cow = new Cow(9, 1);
        cow.inThongTin();
        cow.moo();

    }
    
}