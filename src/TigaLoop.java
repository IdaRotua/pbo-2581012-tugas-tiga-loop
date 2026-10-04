import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // Versi 1: for (pencacah i)
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // Versi 2: while (pencacah j)
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++; // jangan lupa dinaikkan, kalau tidak program menggantung
        }
        System.out.println();

// Versi 3: do-while (pencacah k)
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();

        // Bukti off-by-one: dua penghitung terpisah
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        System.out.println();

        // Saringan deret 1-10 (angka tetap, tidak ikut n)
        int sampaiPrintln = 0;
        System.out.print("Disaring :");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // lewati angka genap
            }
            if (i > 7) {
                break;    // berhenti kalau i > 7
            }
            System.out.print(" " + i);
            sampaiPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + sampaiPrintln + " kali");

        scanner.close();
    }
}
//KENAPA BARIS for DAN while KOSONG, TAPI do-while TIDAK?
//---------------------------------------------------------------
//Dua baris terakhir yang jadi intinya: for dan while mengecek kondisi
//SEBELUM putaran pertama, jadi keduanya tidak mencetak apa pun. do-while
//mengeceknya SESUDAH, jadi satu putaran sudah terlanjur berjalan.
// Dengan n = 0, kondisi for (i <= n) dan while (j <= n) dicek di awal.
//Nilai awalnya 1, dan 1 <= 0 salah, sehingga badan loop tidak pernah
// dijalankan dan tidak ada angka yang tercetak. Pada do-while, badan loop
// dijalankan dulu (mencetak 1), baru kondisi (k <= n) dicek, ternyata
// salah, lalu loop berhenti. Karena itu angka 1 tetap tercetak.

//Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
//jadi badannya pasti jalan minimal sekali.