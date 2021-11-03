/*
*  crated date: 28 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.Tuan7.Inheritance.Animal;

public class Animal {
    protected String sound;
    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private int location;
    protected void makeNoise(){
        System.out.println("A A A");
    }
    protected void eat(){
        System.out.println("eat ");
    }
    protected void sleep(){
        System.out.println("sleep");
    }
    protected void walk(){
        System.out.println("walk");
    }

}