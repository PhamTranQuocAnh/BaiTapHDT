/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.lab4;

public class AccountTestDrive 
{
    public static void main(String[] args) 
    {
        Account account;
        account = new Account(500,1000);
        account.showData();
        account.napTien(500);
        account.showData();
        account.rutTien(250);
        account.showData();
        Customer customer1 = new Customer("Phạm Trần Quốc Anh",2002,"Nam");
        customer1.getName();
        System.out.println();
        Address address = new Address(518, "Đồng Tháp","Việt Nam");
        address.showAddress();



    }
    
}