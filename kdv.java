import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       double tutar,kdvOran,kdvliTutar;
       System.out.print("Ücret tutarını giriniz:");
       tutar = inp.nextDouble();
       if( tutar<1000){
           kdvOran = 0.18;
       }
       else {
           kdvOran = 0.80;
       }
       kdvliTutar = tutar + (tutar * kdvOran);
        System.out.print("kdvli tutar:"+kdvliTutar);


    }
}
