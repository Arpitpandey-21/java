package basic;

import java.util.Scanner;

public class squareof_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int y = sc.nextInt();
        int x;
        x= y * y ;
        System.out.print("Square is:");
        System.out.println(x);
    }
}
