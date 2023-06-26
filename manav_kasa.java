import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
        double a = 2.14 , e = 3.67 , d = 1.11 , m = 0.95 , p = 5.00;
        double a1, e1, d1, m1, p1;
        double toplam_tutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo:" );
        a1 = inp.nextDouble();


        System.out.print("Elma kaç kilo:" );
        e1 = inp.nextDouble();


        System.out.print("Domates kaç kilo:" );
        d1 = inp.nextDouble();


        System.out.print("Muz kaç kilo:" );
        m1 = inp.nextDouble();


        System.out.print("Patlıcan kaç kilo:" );
        p1 = inp.nextDouble();

        toplam_tutar = (a * a1) + (e * e1) + (d * d1) + (m * m1) + (p * p1);
        System.out.print("Alınan ürünlerin toplam tutarı:" + toplam_tutar);


    }
}
