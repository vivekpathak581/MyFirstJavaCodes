import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your feelings: ");
        String feel =sc.nextLine();
         System.out.println("Your input is: "+feel);
         sc.close();
         /* String ghanta="500";
        System.out.println(ghanta); */
    }
}
