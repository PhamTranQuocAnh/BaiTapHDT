/*
*  crated date: 28 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package Tuan8;

public class Employee extends Person {
    protected int salary;
    public String  toString(){
        String s;
        s= name +","+birthday;
        s += "," + salary;
        return s;
    }
    
}
