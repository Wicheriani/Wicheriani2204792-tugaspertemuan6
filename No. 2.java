import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        printJumlahGenap(batasAwal, batasAkhir);
    }

    public static void printJumlahGenap(int batasAwal, int batasAkhir) {
        int jumlahAngka = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahAngka++;
            }
        }
        System.out.println("Jumlah angka genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahAngka);
    }
}
