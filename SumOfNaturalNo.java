import java.util.Scanner;
public class SumOfNaturalNo {
    public static void main() {
        //System.out.print("Enter the no. whose sum you want to find: ");
        System.out.print("Enter the no. from which you want to find the sum of even no.: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            //sum=sum+i;
            sum=sum+i*2;
        }
        //System.out.println("The sum of n natural numbers is: "+sum+".");
        System.out.println("Sum of even numbers: "+sum+".");
    }
}
