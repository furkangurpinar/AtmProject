import java.util.Scanner;

public class ATM {

    public ATM() {
    }

    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz....");
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************");
        int giris_hakki = 3;

        while (!login.login(hesap)) {
            System.out.println("Giriş Başarısız...");
            --giris_hakki;
            System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Bitti...");
                return;
            }
        }

        System.out.println("Giriş Başarılı...");
        System.out.println("*********************************");
        String islemler = "1. Bakiye Görüntüle\n2. Para Yatırma\n3. Para Çekme\nÇıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");

        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                return;
            }

            if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else {
                int tutar;
                if (islem.equals("2")) {
                    System.out.print("Yatırmak istediğiniz tutar : ");
                    tutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraYatir(tutar);
                } else if (islem.equals("3")) {
                    System.out.print("Çekmek istediğiniz tutar : ");
                    tutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraCek(tutar);
                } else {
                    System.out.println("Geçersiz İşlem....");
                }
            }
        }
    }
}


