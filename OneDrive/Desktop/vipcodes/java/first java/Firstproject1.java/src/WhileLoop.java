import java.util.*;
public class WhileLoop {
    public static void main(String[] args){
        int i=0;
        System.out.print("Enter the number till which whole number you want to print: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<n){
            System.out.println(i+1);
            i++;
        }
    }
}
