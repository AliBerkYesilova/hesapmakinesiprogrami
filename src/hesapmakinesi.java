import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.print("Toplama : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma : " + (sayi1*sayi2));
                break;
            case 4:
                if (sayi2 == 0){
                    System.out.print("Sayı sıfıra bölünemez");
                    break;
                }
                else {
                    System.out.print("Bölme : " + (sayi1/sayi2));
                    break;
                }
            default:
                    System.out.print("Yanlış seçim yaptınız tekrar deneyiniz");
                    break;

        }
    }

}
