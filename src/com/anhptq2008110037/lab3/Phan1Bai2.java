/*
*  crated date: 29 thg 9, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab3;
import java.util.Scanner;

public class Phan1Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=2;i<=10;i++){
            for(int j = 1;j<=10;j++){
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
}