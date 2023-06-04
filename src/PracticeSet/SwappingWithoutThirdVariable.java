package PracticeSet;

import java.util.Scanner;

public class SwappingWithoutThirdVariable
{
    public static void main(String[] args) {

       int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number is : ");
        x = sc.nextInt();
        System.out.println("Second number is : ");
        y = sc.nextInt();
        System.out.println("Number before Swapping : " +x+ " " +y);
        x = x - y; // -1
        y = x + y; //
        x = y -x;
        System.out.println("Swapping Done : " +x+ " " +y);



    }
}
