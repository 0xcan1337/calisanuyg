public class Calisan {

    private String isim;

    private String soyisim;

   private int no;

   private int tecrube;

    private double maas;



    public Calisan(String isim, String soyisim, int no, int tecrube, double maas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.no = no;
        this.tecrube = tecrube;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getTecrube() {
        return tecrube;
    }

    public void setTecrube(int tecrube) {
        this.tecrube = tecrube;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }


    public void calisanGoster(){

        System.out.println("ÇALIŞAN BİLGİLERİ:");
        System.out.println("Çalışan adi: " + getIsim());
        System.out.println("Çalışan soyadi: " + getSoyisim());
        System.out.println("Çalışan tecrube: " + getTecrube());
        System.out.println("Çalışan maas: " + getMaas());


    }

    public void zamYap(double zam){

        double zamDeger = 300;
        zam = zamDeger + getMaas();
        System.out.println("Zamlı maaş değeriniz:" + zam);

    }
}
