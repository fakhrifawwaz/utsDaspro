import java.util.Scanner;
public class BonusKaryawan15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bonus = 0;

        // Input data
        System.out.print("Masukkan nilai kinerja (1-100): ");
        int kinerja = sc.nextInt();

        System.out.print("Masukkan lama bekerja (tahun): ");
        double lamaBekerja = sc.nextDouble();

        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = sc.next();

        // Logika perhitungan bonus
        if (kinerja < 70) {
            bonus = 0;
        } else if (kinerja >= 70 && kinerja < 90) {
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else if (lamaBekerja >= 5) {
                bonus = 0.05 * gajiPokok;
            }
        } else if (kinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else if (lamaBekerja >= 5) {
                bonus = 0.07 * gajiPokok;
            }
        }
        // Tambahan bonus sertifikasi
        if (sertifikasi.equalsIgnoreCase("ya") && bonus > 0) {
            bonus  += 500000;
        }

        // Output hasil
        System.out.println("\n==============================");
        System.out.println("Nilai kinerja        : " + kinerja);
        System.out.println("Lama bekerja         : " + lamaBekerja + "tahun");
        System.out.println("Gaji pokok           : " + gajiPokok);
        System.out.println("Status sertifikasi   : " + sertifikasi);
        System.out.println("------------------------------");
        System.out.println("Total bonus          : Rp " + bonus);
        System.out.println("==============================");

        sc.close();
    }
}
