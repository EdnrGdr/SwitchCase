import java.util.Scanner;

public class Main {

    public static  void main (String [] args) {

        /*  Switch  case  if - if-else yapısına alternatif kullanılabilir

        switch (op){

        case durum1:
        islemler
        break

        case durum2:
        islemler
        break

        default:
        islemler
        break

         */


        Scanner scanner = new Scanner( System.in);

        System.out.print("Lütfen bir islem giriniz..:");

        int islem = scanner.nextInt();

        switch ( islem) {

            case 1:
                System.out.println("1. Case İsleme Alındı");


            case 2:
                System.out.println("2.Case İsleme Alındı");


            case 3:
                System.out.println("3.Case İsleme Alındı");
                break; // break kullanılmasının amacı diğer case lere bakma. Kosullar sağlanmışsa durdur. Break olmazda tüm caseleri kontrol eder. İstenilen case e break konulur. hangi case e konulana kadar tüm caselere bakılır. if / if-else fakının aynısı :)
            case 4:
                System.out.println("4. Case İsleme Alındı");
                break;
            default:
                System.out.println("Hic bir case i saglamadı :)");
                break;
        }



    }
}
