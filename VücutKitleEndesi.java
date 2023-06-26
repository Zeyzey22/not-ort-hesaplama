import java.util.Scanner;

public class VücutKitleEndesi {
    public static void main(String[] args) {
        double height , weight, a;
        // a =  vücut kitle endeksi//
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        height = inp.nextDouble();


        System.out.print("Lütfen kilonuzu giriniz:");
        weight = inp.nextDouble();

        a = weight / (height * height );
        System.out.print("Vücut kite endeksiniz:" + a);




    }
}
