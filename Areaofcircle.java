package basic;

import java.util.Scanner;

public class Areaofcircle {
    static void main() {
        Scanner sc = new Scanner(System.in); //for taking inputs
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double a;
        a=3.14*r*r;
        System.out.print("Area of circle=");
        System.out.println(a);
    }
}
//Area of circle=pi*r*r