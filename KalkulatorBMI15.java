import java.util.Scanner;
public class KalkulatorBMI15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double berat, tinggi, bmi;
        String kategori, risiko;
        
        //Input berat badan dan tinggi badan
        System.out.println("Masukkan berat badan (kg): ");
        berat = sc.nextDouble();

        System.out.println("Masukkan tinggi badan (m): ");
        tinggi = sc.nextDouble();

        //Menghitung BMI
        bmi = berat / (tinggi * tinggi);

        //Menentukan kategori BMI dan risiko kesehatan yang sesuai
        if (bmi < 18.5) {
            kategori = "kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi >= 18.5 && bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Relatif rendah.";
        } else if (bmi >= 25 && bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        //Output
        System.out.println("\n=== HASIL PERHITUNGAN BMI ===");
        System.out.printf("Nilai BMI: %2f%n", bmi);
        System.out.println("Kategori: " + kategori);
        System.out.println("Risiko Kesehatan: " + risiko);

        sc.close();
    }
}