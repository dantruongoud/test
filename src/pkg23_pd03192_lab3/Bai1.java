package pkg23_pd03192_lab3;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT có vô số nghiệm");
            } else {
                System.out.println("PT vô nghiệm!");
            }
        } else {
            float x = (float) ((float) -b / a);
            System.out.println("PT có một nghiệm duy nhất: " + x);
        }
    }

}
