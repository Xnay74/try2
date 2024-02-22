import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data
        System.out.println("Masukkan sebuah angka: ");

        // Membaca input pengguna dan menyimpannya dalam variabel
        int angka = scanner.nextInt();

        // Menampilkan hasil input
        System.out.println("Anda memasukkan angka: " + angka);

        // Menutup Scanner setelah digunakan
        scanner.close();
    }
}
