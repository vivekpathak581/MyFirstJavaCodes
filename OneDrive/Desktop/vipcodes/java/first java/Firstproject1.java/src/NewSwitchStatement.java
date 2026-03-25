import java.util.*;
public class NewSwitchStatement {
    public static void main(String[] args){
        System.out.println("Please enter number from 1 to 7!!!");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the day in integer from 1 to 7: ");
        int day=sc.nextInt();
        if(day>=1&&day<8){switch(day){
            case 1:
                System.out.println("Sunday: "+day);
                break;
            case 2:
                System.out.println("Monday: "+day);
                break;
            case 3:
                System.out.println("Tuesday: "+day);
                break;
            case 4:
                System.out.println("Wednesday: "+day);
                break;
            case 5:
                System.out.println("Thursday: "+day);
                break;
            case 6:
                System.out.println("Friday: "+day);
                break;
            case 7:
                System.out.println("Saturday: "+day);
                break;
           }

        }
        else{
            System.out.println("Please enter a valid number from 1 to 7!!");

        }
    }
}
