import java.util.Scanner;

public class ucakbiletihesaplama {
    public static void main(String[] args) {

        int range, age, flyType, total;
        double price, discount, fdiscount;


        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen Gideceğiniz Mesafeyi Kilometre Cinsinden Yazınız");
        range = input.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Giriniz. 1 = Tek Yön 2= Gidiş-Dönüş");
        flyType = input.nextInt();

        if (range < 0) {
            System.out.println("Lütfen Geçerli Bir Menzil Giriniz");
        }

        if (age <= 0) {
            System.out.println("Yaşınızı Hatalı Girdiniz Girdiniz");
        }

        if (flyType != 1 && flyType != 2) {
            System.out.println("Hatalı Veri Girdiniz");
        }


        if (age < 12 && flyType == 1) {
            price = range * 0.10;
            discount = price * 0.50;
            System.out.println("Yaştan Kazandığınız  İndiriminiz : " + discount);
            System.out.println("Toplam Bilet Fiyatı : " + (price - discount));
        }
        if (age >= 12 && age <= 24 && flyType == 1) {
            price = range * 0.10;
            discount = price * 0.10;
            System.out.println("Yaştan Kazandığınız  İndiriminiz : " + discount);
            System.out.println("Toplam Bilet Fiyatı : " + (price - discount));

        }

        if (age > 65 && flyType == 1) {
            price = range * 0.10;
            discount = price * 0.30;
            System.out.println("Yaştan Kazandığınız İndiriminiz : )" + discount);
            System.out.println("Toplam Bilet Fiyatı : " + (price - discount));
        }

        if (age < 12 && flyType == 2) {
            price = range * 0.10;
            discount = price * 0.50;
            fdiscount = price * 0.20;
            System.out.println("Yaştan Kazandığınız  İndiriminiz : " + discount);
            System.out.println("Uçuş Tipinden Kazandığınız İndirim : " + fdiscount);
            System.out.println("Toplam Bilet Fiyatı : " + 2 * (price - discount - (fdiscount)));
        }
        if (age >= 12 && age <= 24 && flyType == 2) {
            price = range * 0.10;
            discount = price * 0.10;
            fdiscount = price * 0.20;
            System.out.println("Yaştan Kazandığınız  İndiriminiz : " + discount);
            System.out.println("Uçuş Tipinden Kazandığınız İndirim : " + fdiscount);
            System.out.println("Toplam Bilet Fiyatı : " + 2 * (price - discount - (fdiscount)));
        }

        if (age > 65 && flyType == 2) {
            price = range * 0.10;
            discount = price * 0.30;
            fdiscount = price * 0.20;
            System.out.println("Yaştan Kazandığınız İndiriminiz : )" + discount);
            System.out.println("Uçuş Tipinden Kazandığınız İndirim : " + fdiscount);
            System.out.println("Toplam Bilet Fiyatı : " + 2 * (price - discount - (fdiscount)));
        }


    }
}