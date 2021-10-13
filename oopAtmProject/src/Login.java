import java.util.Scanner;

public class Login {
    public Login() {
    }

    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        String kullanici_adi = scanner.nextLine();
        System.out.print("Parola : ");
        String parola = scanner.nextLine();
        return hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola);
    }
}
