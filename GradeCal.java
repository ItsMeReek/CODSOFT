import java.util.*;
public class GradeCal
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects");
        int n=sc.nextInt();
        int total=0,marks=0;
        System.out.println("marks cannot be negative and should be entered between 0 to 100");
        for(int i=1;i<=n;i++){
            System.out.println("enter the marks of subject"+i);
            marks=sc.nextInt();
            if(marks<0 || marks>100){
                System.out.println("wrong input! ");
                System.exit(10);
            }
            total+=marks;
            
        }
        double avg_percent=(double)(total/n);
        System.out.println("Total marks obtained is "+total);
        System.out.println("The avergae percentage obtained is "+avg_percent+"%");
        char grade=' ';
        if(avg_percent>=0 && avg_percent<=33){
            grade='F';
        }
        else if(avg_percent>33 && avg_percent<=50){
            grade='D';
        }
        else if(avg_percent>50 && avg_percent<=75){
            grade='C';
        }
        else if(avg_percent>75 && avg_percent<=85){
            grade='B';
        }
        else if(avg_percent>85 && avg_percent<=95){
            grade='A';
        }
        else if(avg_percent>95 && avg_percent<=100){
            System.out.println("Your grade is A+");
        }
        
        if(avg_percent>0 && avg_percent<=94){
            System.out.println("Your grade is "+grade);
        }
        System.out.println("\n --------------------------------------------------------------------------------------------------------");
        System.out.println("grade A+ is for average percentage of 95 above ");
        System.out.println("grade A is if your average percentage is between 86 and  95");
        System.out.println("grade B is if your average percentage is between 76 and  85");
        System.out.println("grade C is if your average percentage is between 51 and  75");
        System.out.println("grade D is if your average percentage is between 34 and  50");
        System.out.println("grade F is if your average percentage is between 0  and  33 . This grade represents you have failed the exam ");
    }
}
