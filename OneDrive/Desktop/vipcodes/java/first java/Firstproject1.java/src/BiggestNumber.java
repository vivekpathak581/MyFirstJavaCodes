import java.util.*;
public class BiggestNumber {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the first number: ");
       int firstNumber=sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber=sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber=sc.nextInt();


        if(firstNumber==secondNumber){
            if(secondNumber>thirdNumber){
                System.out.println("Both first and second numbers are equal and are greater than third number: "+secondNumber);
            }
            else if(secondNumber==thirdNumber){
                System.out.println("All the numbers are equal: "+secondNumber);
            }
            else{
                System.out.println("Third number is greater than both first and second number that are both equal to each other: "+thirdNumber);
            }
        }
        else if(firstNumber==thirdNumber){
            if(secondNumber<thirdNumber){
                System.out.println("Both first and third numbers are equal and are greater than second number: "+thirdNumber);
            }
            else if(secondNumber>thirdNumber){
                System.out.println("Both first and third numbers are equal and second number is bigger than both: "+secondNumber);
            }
        }

        else if(thirdNumber==secondNumber){
            if(secondNumber>firstNumber){
                System.out.println("Both second and third numbers are equal and are greater than first number: "+secondNumber);
            }
            else if(secondNumber<firstNumber){
                System.out.println("Both second and third number are equal and first number is bigger than both: "+firstNumber);
            }
        }

        else if(firstNumber>secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println("First Number is the biggest among all: "+firstNumber);
            }
            else{
                System.out.println("Third Number is the biggest among all: "+thirdNumber);
            }
        }

        else if (secondNumber>thirdNumber){
                    System.out.println("Second number is the biggest among all: "+secondNumber);
                }
            /*else{
                    System.out.println("Third Number is the biggest among all: "+thirdNumber);
                }*/

        //else if (thirdNumber>firstNumber){
        else if(thirdNumber>secondNumber) {
                System.out.println("Third Number is the biggest among all of them: " + thirdNumber);
            }

            /*else{
                System.out.println("Second number is the biggest among all: "+secondNumber);
            }*/
       // }
        else{
            System.out.println("Please enter all numbers correctly, only numbers are allowed!! ");
        }


    }
}
