
package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("please enter first number");
            int numone = scanner.nextInt();
            System.out.println("please enter second number");
            int numtwo = scanner.nextInt();
            System.out.println("please choose one operator");
            System.out.println(" 1:+ \n 2:- \n 3:* \n 4:/");
            int operator = scanner.nextInt();
            if (operator == 1) {
                System.out.println(numone + numtwo);
            }
            if (operator == 2) {
                System.out.println(numone - numtwo);
            }
            if (operator == 3) {
                System.out.println(numone * numtwo);
            }
            if (operator == 4) {
                System.out.println(numone / numtwo);
            }
        }

    }
}
