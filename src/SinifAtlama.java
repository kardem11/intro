import java.util.Scanner;

public class SinifAtlama {
    public static void main(String[] args) {
        int turkce,matematik,fenBilgisi,sosyalBilgiler,bedenEgitimi;
        double ortalama = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("turkce : ");
            turkce = input.nextInt();
            System.out.println("matematik : ");
            matematik = input.nextInt();
            System.out.println("FenBilgisi : ");
            fenBilgisi = input.nextInt();
            System.out.println("SosyalBilgiler : ");
            sosyalBilgiler = input.nextInt();
            System.out.println("Beden Egitimi : ");
            bedenEgitimi = input.nextInt();
        }
        ortalama = (turkce+matematik+fenBilgisi+sosyalBilgiler+bedenEgitimi)/ 5 ;
        System.out.println("Ortalama : " + ortalama);
        if (ortalama > 50) {
            System.out.println("Gectiniz :)");
        }else {
            System.out.println("Kaldiniz");
        }
    }
}
