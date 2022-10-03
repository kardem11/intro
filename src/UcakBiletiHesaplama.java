import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.print("Mesafeyi Giriniz : ");
        km = scan.nextInt();
        System.out.print("Yasinizi Giriniz : ");
        yas = scan.nextInt();
        System.out.print("Yolculuk Tipini Seciniz (1= Tek Gidis , 2- Gidis/Donus) : ");
        tip = scan.nextInt();
        double normalFiyat,yasIndirimi,tipIndirimi;
        scan.close();
        if (km > 0 && yas > 0 && (tip==1 || tip==2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;
        }else if(yas >= 12 && yas <= 24) {
            yasIndirimi = normalFiyat * 0.10;
        }else if(yas >= 65) {
            yasIndirimi = normalFiyat * 0.30;
        }else {
            yasIndirimi = 0;
        }
        normalFiyat -= yasIndirimi;
        if(tip == 2) {
            tipIndirimi = normalFiyat * 0.20;
            normalFiyat = (normalFiyat - tipIndirimi) * 2;
        }
        System.out.println("Bilet Tutari " + normalFiyat + "$");
        }else {
            System.out.println("Eksik Veya Hatali Giris Yaptiniz. Lutfen Tekrar Deneyiniz ! ");
        }
       


    }
}
