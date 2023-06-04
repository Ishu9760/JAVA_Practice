package PracticeSet;

import java.util.Scanner;

public class SwappingUsingThirdVariable
{
    public static void main(String[] args) {

        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextInt();
        System.out.println("Enter your second number: ");
        b = sc.nextInt();
        System.out.println("Number before Swapping are: "+a+ " " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("Number after swapping: "+a+ " " + b);
    }
}
