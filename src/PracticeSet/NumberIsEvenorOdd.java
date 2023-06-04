package PracticeSet;

import java.util.Scanner;

public class NumberIsEvenorOdd
{
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of your choice");
        x = sc.nextInt();
        if(x%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
