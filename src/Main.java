
public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("123456789", "Veri Yapıları", "Ahmet Yazar");
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-01", kitap1);
        Kullanici kullanici1 = new Kullanici("U101", "Ayşe Demir");
        
        OduncKaydi kayit = new OduncKaydi(kullanici1, kopya1);
        kayit.bilgileriGoster();
    }
}
