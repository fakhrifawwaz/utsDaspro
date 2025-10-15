import java.util.Scanner;
public class BilanganTerbesar15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();

        System.out.print("Masukkan anka ketiga: ");
        int angka3 = sc.nextInt();

        //Validasi input
        if (angka1 < 0 || angka2 < 0 || angka3 < 0) {
            System.out.println("Input tidak valid. Harap masukkan angka positif.");
        } else {
            //Apabila semua angka sama
            if (angka1 == angka2 && angka2 == angka3) {
                System.out.println("Semua angka sama besar yaitu: " + angka1);
            }
            //Apabila angka 1 yang terbesar
            else if (angka1 >= angka2 && angka1 >= angka3) {
                if (angka1 == angka2 || angka1 == angka3) {
                    System.out.println("Ada beberapa angka terbesar yaitu: " + angka1);
                } else {
                    System.out.println("Angka terbesar adalah: " + angka1);
                }
            }
            //Apabila angka 2 yang terbesar
            else if (angka2 >= angka1 && angka2 >= angka3) {
                if (angka2 == angka3) {
                    System.out.println("Ada beberapa angka terbesar yaitu: " + angka2);
                } else {
                    System.out.println("Angka terbesar adalah: " + angka2);
                }
            }
            //Apabila angka 3 yang terbesar
            else {
                System.out.println("Angka terbesar adalah: " + angka3);
            }
        }

        sc.close();

    }
}
    

