import java.util.*;
/**
 * master
 */
public class master {

        public static void main(String[] args) {
                BankAccount obj1=new BankAccount("XYZ","BA0001");
                obj1.showMenu();
        }
}
class BankAccount{
        int balance;
        int previousTransaction;
        String CustomerName;
        String CustomerId;
        BankAccount(String cname,String cid){
                CustomerName=cname;
                CustomerId=cid;
        }
       void depoist(int amount){
        if(amount!=0){
                balance=balance+amount;
                previousTransaction=amount;
        }
       } 
       void withdraw(int amount){
        if(amount!=0){
                balance=balance-amount;
                previousTransaction=-amount;

        }
       }
       void getPreviousTransaction(){
        if(previousTransaction>0){
                System.out.println("Depoisted:"+previousTransaction);
        }
        else if(previousTransaction<0){
                System.out.println("withdraw:"+Math.abs(previousTransaction));
        }
        else{
                System.out.println("No Transaction occured");
        }
       }
       void showMenu(){
        char option ='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+ CustomerName);
        System.out.println("Your Id is:"+ CustomerId);
        System.out.println("\n");
        System.out.println("A.CheckBalance");
        System.out.println("B.Depoist");
        System.out.println("C.Withdraw");
        System.out.println("D.Previous Transaction");
        System.out.println("E.Exit");
        do{
                System.out.println("========================================================");
                System.out.println("Enter an option");
                System.out.println("========================================================");
                option=sc.next().charAt(0);
                System.out.println("\n");
                switch (option){
                        case 'A':
                        System.out.println("---------------------------------------");
                        System.out.println("Balance:"+ balance);
                        System.out.println("---------------------------------------");
                        System.out.println("\n");
                        break;
                        case 'B':
                        System.out.println("----------------------------------------");
                        System.out.println("Enter an amount to depoist:");
                        System.out.println("----------------------------------------");
                        int amount=sc.nextInt();
                        depoist(amount);
                        System.out.println("\n");
                        break;
                        case 'C':
                        System.out.println("-----------------------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("-----------------------------------------");
                        int amount2=sc.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;
                        case 'D':
                        System.out.println("-------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("--------------------------------------------");
                        System.out.println("\n");
                        break;
                        
                        case 'E':
                        System.out.println("==============================================");
                        break;
                        default:
                        System.out.println("Invalid option!!.please enter again");
                        break;

                }
        }
                while(option!='E');
                System.out.println("Thankyou for using our services");
        

       }


}