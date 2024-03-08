import java.util.Scanner;



public class Main {
   private static String isim;
    private  static String soyisim;
    private  static int no;
    private  static int tecrube;
   private static int maas;


    public static void main(String[] args) {



        Scanner girdi = new Scanner(System.in);

        System.out.println("Basit Çalışan yönetimi uygulamasına hoş geldiniz.");
        System.out.println("Lütfen devam etmek için bir tuşa basınız:");
        String devam = girdi.nextLine();
        if (!devam.isEmpty()){
            System.out.println("Çalışanın adını giriniz: ");
            isim = girdi.nextLine();
            System.out.println("Çalışanın soyadını giriniz: ");
            soyisim = girdi.nextLine();

            System.out.println("Çalışanın numarasını giriniz: ");
            no = girdi.nextInt();

            System.out.println("Çalışanın tecrüye yılını giriniz: ");
            tecrube = girdi.nextInt();

            System.out.println("Çalışanın maaşını giriniz: ");
            maas = girdi.nextInt();

            DevamEt();
        }
        else {
            System.out.println("Devam etmek için bir değer giriniz.");
        }

    }

    public static void DevamEt(){

        Calisan calisan1 = new Calisan(isim,soyisim,no,tecrube,maas);
        calisan1.calisanGoster();
        calisan1.zamYap(calisan1.getMaas());

    }
}