package basic;

import java.util.Scanner;

public class VolumeOfSphere {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r= sc.nextDouble();
        double v;

        v = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.print("Volume of sphere=");
        System.out.println(v);
    }
}
//VOLUME OF SPHERE= (4/3)*pi*r*r*r