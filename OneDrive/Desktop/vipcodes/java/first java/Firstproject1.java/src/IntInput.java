import java.util.Scanner;
public class IntInput {
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Your entered age is: "+age);
        //Scanner sc= new Scanner(System.in);
        System.out.print("Enter the firstNumber: ");
        int firstNumber=sc.nextInt();
        System.out.print("Enter secondNumber: ");
        int secondNumber=sc.nextInt();
        int result=firstNumber+secondNumber;
        System.out.println(result);
        sc.close();
    }
}
