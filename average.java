import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("math point a is :");
        a = inp.nextInt();
        System.out.println("physics point b is:");
        b = inp.nextInt();
        System.out.println("chemistry point c is:");
        c = inp.nextInt();
        System.out.println("turkish point d is:");
        d = inp.nextInt();
        System.out.println("history point e is:");
        e = inp.nextInt();
        System.out.println("music point f is:");
        f = inp.nextInt();
        int avrg = (a+b+c+d+e+f)/6;
        System.out.println("The average is:"+avrg);
        boolean condition = avrg>=60;
        String str = (condition) ? "PASSED": "FAILED";
        System.out.println(condition ? "PASSED": "FAILED");



    }
}
