package PracticeSet;

import java.util.Scanner;

public class addition

{
    public static void main(String[] args) {

        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        x = sc.nextInt();
        System.out.println("Enter your second number: ");
        y = sc.nextInt();

        z = x + y;
        System.out.println("The addition of two numbers is " + z);

    }
}
