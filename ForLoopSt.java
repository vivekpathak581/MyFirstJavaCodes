import java.util.Scanner;
public class ForLoopSt {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number that how many times you wnat output: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Hello world!!");
            //System.out.println(i*n);

        }
    }
}
