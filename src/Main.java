public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        
        String altMetin = "Vade Süresi";
        System.out.println(altMetin);

        int vade = 12;
        System.out.println(vade);

        double dolarDun = 18.20;
        double dolarBugun = 18.20;

        String okYonu = "";

        if (dolarBugun< dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);

        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);

        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan", "Mutlu Emeklilik"};
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
            System.out.println(".................");
        }



        






    }
}
