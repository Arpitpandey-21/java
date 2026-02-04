package if_else;

import java.util.Scanner;

public class EVEN_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
