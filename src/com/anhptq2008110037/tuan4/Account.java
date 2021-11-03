/*
*  crated date: 13 thg 10, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.tuan4;

public class Account 
{
    int account_balance;
    int account_number;


    Account (int a, int b) 
    {
        account_number = a;
        account_balance = b;
    }


    void showData() 
    {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account balance: " + account_balance);
        System.out.println("");
    }


    void rutTien(int amount) 
    {
        account_balance -= amount;
        System.out.println("");
    }


    void napTien(int amount) 
    {
        account_balance += amount;
        System.out.println("");

    }
  
    
}
