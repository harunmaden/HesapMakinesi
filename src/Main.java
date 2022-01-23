import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        int n1 = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int n2 = inp.nextInt();
        System.out.println("Hangi İşlemin Yapılacağını Seçiniz /n 1. Toplama /n 2. Çıkarma /n 3. Çarpma /n 4. Bölme");
        int points= inp.nextInt();
        switch(points)
        {
            case 1: System.out.println("Toplama Sonucu :" + (n1 + n2)); break;
            case 2: System.out.println("Çıkarma Sonucu :" + (n1 - n2)); break;
            case 3: System.out.println("Çarpma Sonucu :" + (n1 * n2)); break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme Sonucu :" + (n1 / n2));
                    break;
                } else {
                    System.out.println("Bölme İşleminde Payda Sıfır Olamaz");
                    break;
                }
            default: System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}
