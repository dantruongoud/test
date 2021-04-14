
package pkg23_pd03192_lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("1. Bai1");
        System.out.println("2. bai2");
        System.out.println("3. bai3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn chọn chức năng");
        int so = sc.nextInt();
        switch (so) {
            case 1:
                Bai1.main(args);
                break;
            case 2:
                bai2.main(args);
                break;
            case 3: 
                bai3.main(args);
                break;
        }
    }
}
