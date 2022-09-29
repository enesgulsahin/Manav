import java.util.Scanner;

public class main {
public static void main (String[] args) {

    Scanner in = new Scanner(System.in);

double armut= 2.14, muz=0.95, patlican=5.00, domates=1.11, elma=3.67;
double armutKilo, muzKilo, patlicanKilo, domatesKilo, elmaKilo, ToplamTutar;

System.out.print("Armut Kaç Kilo? :");
armutKilo = in.nextDouble();
System.out.print("Muz Kaç Kilo? :");
muzKilo = in.nextDouble();
System.out.print("Patlıcan Kaç Kilo? :");
patlicanKilo = in.nextDouble();
System.out.print("Domates Kaç Kilo? :");
domatesKilo = in.nextDouble();
System.out.print("Elma Kaç Kilo? :");
elmaKilo = in.nextDouble();

armut *= armutKilo;
muz *= muzKilo;
patlican *= patlicanKilo;
domates *= domatesKilo;
elma *= elmaKilo;
ToplamTutar = armut + muz + patlican + domates + elma;
System.out.print("Toplam Tutar :" + ToplamTutar + "TL");




}
}


