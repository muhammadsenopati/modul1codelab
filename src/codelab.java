import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class codelab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        String gender = scan.next();
        String jenisKelamin;
        if (gender.equals("L")||gender.equals("l")) {
            jenisKelamin = "Laki - Laki";
        } else if (gender.equals("P")||gender.equals("p")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Jenis kelamin tidak valid, Silahkan input lagi";
        }

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String ulangtahun = scan.next();
        LocalDate tanggalLahir = LocalDate.parse(ulangtahun);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);

        System.out.println("\nData diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + selisih.getYears() + " tahun, " + selisih.getMonths() + " bulan, " + selisih.getDays() + " hari.");
    }
}
