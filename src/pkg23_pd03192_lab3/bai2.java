package pkg23_pd03192_lab3;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT vo nghiem!");
                } else {
                    System.out.println("PT co vo so nghiem");
                }
            } else {
                float x = (float) ((float) -c / b);
                System.out.println("PT co 1 nghiem duy nhat: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            float x1 = (float) ((float) (-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((float) (-b - Math.sqrt(delta)) / (2 * a));
            if (delta < 0) {
                System.out.println("PT vo nghiem: ");
            } else if (delta == 0) {
                System.out.println("PT co nghiem kep: " + -b / (2 * a));
            } else {
                System.out.printf("PT co 2 nghiem: x1=%.3f,x2=%.3f",x1, x2);
            }
        }
    }
}
