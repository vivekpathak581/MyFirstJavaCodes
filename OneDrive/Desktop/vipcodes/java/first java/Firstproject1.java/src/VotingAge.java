import java.sql.SQLOutput;
import java.util.Scanner;
public class VotingAge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of yours to check whether you can vote: ");
        int age=sc.nextInt();
        if(age>=18&&age<=21)
            System.out.println("You are eligible to vote");
        else if( age>=22 ){
            System.out.println("You are a mature adult, you can vote.");}
        else
            System.out.println("You can't vote");
    }
}