import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int sayi1, sayi2, secim;
            System.out.println("Sayi Giriniz: ");
            sayi1 = scan.nextInt();
            System.out.println("Sayi Giriniz" );
            sayi2 = scan.nextInt();
            System.out.println("Lutfen Yapmak İstediginiz Islemi Seciniz ");
            System.out.println("1-Toplama\n2- Cikarma\n3- Carpma\n4 Bolme");
            System.out.println("---------");
            secim = scan.nextInt();

            if(secim == 1) {
                System.out.println("Toplama : " + (sayi1 + sayi2));
            }else if (secim == 2) {
                System.out.println("Cikarma : " + (sayi1-sayi2));
            }else if (secim == 3) {
                System.out.println("Carpma : " + (sayi1*sayi2));
            }else if (secim == 4) {
                if (sayi2 == 0) {
                    System.out.println("Sayi 0'a esittir ve sonuc belirsizdir !");
                }else {
                    System.out.println("Bolme :" + (sayi1/sayi2));
                }
            }else {
                    System.out.println("Tekrar Deneyin ! ");
                }
        }
            
        }
        

        
        
    }

