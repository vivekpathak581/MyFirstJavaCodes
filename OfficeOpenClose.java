import java.util.Scanner;
public class OfficeOpenClose {
    public static void main(String[] args){
        System.out.println("Only enter the timings");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the timing to check whether office is on or not: ");
        int time=sc.nextInt();
        if(time>=10&&time<=20){
            System.out.println("Office is open.");
        }
        else{
            System.out.println("Office is closed.");
        }
    }
}
