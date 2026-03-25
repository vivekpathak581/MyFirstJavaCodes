import java.util.*;
public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number: ");
        int num1= sc.nextInt();
        System.out.println("enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("enter a third number: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3 ) {

                System.out.println(num1 + " is greater");

        }
        else if (num2 > num3){
            System.out.println(num2 + " is greater");
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println("All are equal");
        }
        else {
            System.out.println(num3 + " is greater");
        }
    }
}
