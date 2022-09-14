import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar;
        Scanner input = (new Scanner(System.in));

        System.out.println("Ürünün bedelini yazınız : ");
        tutar = input.nextDouble();

        double kdv18 = 0.18;
        double kdv8 = 0.08;

        double sonuc = (tutar>1000) ? tutar * kdv8 + tutar : tutar * kdv18 + tutar;

        System.out.println("Ürünün Vergili Fiyatı : " + sonuc);



    }
}
