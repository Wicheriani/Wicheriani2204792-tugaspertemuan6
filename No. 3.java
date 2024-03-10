import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = input.nextInt();

        hitungDanCetakPTB(a, b);
    }

    public static void hitungDanCetakPTB(int a, int b) {
        int ptb = hitungPTB(a, b);
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + ptb);
    }

    public static int hitungPTB(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hitungPTB(b, a % b);
    }
}
