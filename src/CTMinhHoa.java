/*
*  crated date: 30 thg 9, 2021
*  author: PhamTranQuocAnh
*/
public class CTMinhHoa {
    public static void main(String[] args) {
    int account_number =20;
    int account_balance =100;
        account_balance =  account_balance +100;
        show_balance(account_number, account_balance);
        account_balance = account_balance -20;
        show_balance(account_number, account_balance);
    }
    public static void show_balance (int account_number, int account_balance){
        System.out.println("account_number = "+account_number);
        System.out.println("account_balance= "+account_balance);
    }

}