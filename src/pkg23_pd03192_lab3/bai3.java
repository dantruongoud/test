
package pkg23_pd03192_lab3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDien;
        System.out.println("Nhập số điện");
        soDien=sc.nextInt();
        if (soDien<50) {
            double tien=soDien*1000;
            System.out.println("Tiền điện là: "+tien);
        } else {
            double tien=50*1000+(soDien-50)*1200;
        }
    }
}
