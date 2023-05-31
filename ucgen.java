import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("üçgenin a kenarını giriniz:");
        a = inp.nextInt();
        System.out.print("üçgenin b kenarını giriniz:");
        b = inp.nextInt();
        System.out.print("üçgenin c kenarını giriniz:");
        c = inp.nextInt();
        // 2u = ücgenin cevresi  //
        if ((a+b)>c && (a+c)>b && (b+c>a)) {
            double u = (a + b + c) / 2.0;
            double alan;
             alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
            System.out.println("üçgenin alanı:" + alan);
        }
            else
                System.out.println("üçgenin alanı yoktur.");

            }


        }







