package ATM;
import java.util.*;
public class Bal
{   
    int balance;
	public Bal(int bal){
	balance = bal;
    }
    public void Input(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the balance of your account ");
         balance=sc.nextInt();
    }
    int getBal(){
        
        return balance;
    }
}

package ATM;
import java.util.*;
public class InterFace extends Bal
{   
        int deposit;
        int withdraw;
    	public InterFace(int bal){
	super(bal);
	deposit=0;
    	withdraw=0;	
    }
    Scanner sc=new Scanner(System.in);
    public void withdraw(){
        System.out.println("enter the withdraw amount ");
        withdraw=sc.nextInt();
        if(super.getBal()<withdraw){
            System.out.println("insufficient balance !");
        }
        else{
            balance-=withdraw;
        }    
        System.out.println("after withdrawl the balance is "+balance);
    }
    public void deposit(){
        System.out.println("enter the deposit amount ");
        deposit=sc.nextInt();
        balance+=deposit;
        System.out.println("after deposit the balance is "+balance);
    }
    public void checkbalance(){
        System.out.println("the balance is "+balance);
    }
    public static void main(String args[]){
        Scanner sc1=new Scanner(System.in);
        
	int bal = 5000;
        InterFace a=new InterFace(bal);
        a.Input();
     
        char ch=' ';
        System.out.println("withdraw");
        System.out.println("deposit");
        System.out.println("balance");
        System.out.println("to withdraw money press w , to deposit money press d and to check balance press c .");
        ch=sc1.next().charAt(0);
        char ch1=' ';
        do{
             switch (ch){
                case 'w':a.withdraw();break;
                case 'W':a.withdraw();break;
                case 'd':a.deposit();break;
                case 'D':a.deposit();break;
                case 'c':a.checkbalance();break;
                case 'C':a.checkbalance();break;
                default : System.out.println("wrong input !");
                
                }
             System.out.println("if you want to continue press y ");        
             ch1=sc1.next().charAt(0);
            }while(ch1=='y'|| ch1=='Y');
        }
    }
