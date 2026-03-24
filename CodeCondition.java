import java.util.Scanner;
public class CodeCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt(); //input
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        int max=0;
        //if else nested
       /* if(a>b){
            if(a>c){
                System.out.println(a);
            else{
                    System.out.println(c);
                }
            }
        }
        if(b>a){

        }*/

        //ternary operator
        max= a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("value of max: "+max);
    }
}
