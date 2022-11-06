import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int tutar;
        double kdv,kdvTutar;

        Scanner inp=new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        tutar=inp.nextInt();
        double kdvOran= (tutar<1000) ? 0.18 : 0.08;

        kdv=tutar*kdvOran;
        kdvTutar=tutar+kdv;
        System.out.println("Kdv'siz tutar: "+tutar);
        System.out.println("Kdv'li tutar: "+ kdvTutar);
        System.out.println("Kdv tutarı: "+ kdv);
    }
}