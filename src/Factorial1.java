import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {

        int i, number ,fact = 1;

        System.out.println("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        for(i = 1; i <= number; i++) {
          fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}


