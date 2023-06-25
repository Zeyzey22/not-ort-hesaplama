import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total = 10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = inp.nextInt();
        total = total + (km * perKM);

        total = (total < 20)  ? 20 : total;
        System.out.println(total);

    }
}
