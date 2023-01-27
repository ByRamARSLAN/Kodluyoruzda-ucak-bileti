import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas, mesafe, yolculukTipi;
        double kmBasinaUcret = 0.10, normalUcret, indirimliUcret;

        Scanner giris = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz : ");
        mesafe = giris.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = giris.nextInt();

        System.out.print("Tekyön için 1'i, gidiş-dönüş için 2'yi tuşlayınız : ");
        yolculukTipi = giris.nextInt();

        switch (yolculukTipi) {

            case 1:
                if (yas <= 0 || mesafe < 0) {
                    System.out.println("Yaşınız / gideceğiniz mesafe sıfır veya sıfırdan küçük olamaz!");
                } else if (yas < 12) {
                    System.out.println(normalUcret = (kmBasinaUcret * mesafe) * 0.5);
                } else if (yas >= 12 && yas < 65) {
                    System.out.println(normalUcret = kmBasinaUcret * mesafe);
                } else {
                    System.out.println(normalUcret = (kmBasinaUcret * mesafe) * 0.3);
                }
                break;

            case 2:
                if (yas <= 0 || mesafe < 0) {
                    System.out.println("Yaşınız / gideceğiniz mesafe sıfır veya sıfırdan küçük olamaz!");
                } else if (yas < 12) {
                    System.out.println(normalUcret = (kmBasinaUcret * mesafe) * 0.5 * 0.8);
                } else if (yas >= 12 && yas < 65) {
                    System.out.println(normalUcret = (kmBasinaUcret * mesafe) * 0.8);
                } else {
                    System.out.println(normalUcret = (kmBasinaUcret * mesafe) * 0.3 * 0.8);
                }
                break;

        }
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı giriş yaptınız, tek yön için 1'i, gidiş dönüş için 2'yi tuşlayın!");
        }

    }
}