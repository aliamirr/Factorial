import java.util.Scanner;

public class Factorial2 {
    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args) {
       int i, fact = 1, number;

       System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();

        fact = factorial(number);

        System.out.println("Factorial of " + number + " is " + fact);
    }

}
