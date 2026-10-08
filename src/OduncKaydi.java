import java.time.LocalDate;

public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;
    private LocalDate oduncTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = LocalDate.now();
        this.kitapKopyasi.setDurum(false); 
    }

    public void bilgileriGoster() {
        System.out.println("--- Ödünç Bilgisi ---");
        System.out.println("Kullanıcı: " + kullanici.getAdSoyad());
        System.out.println("Kitap: " + kitapKopyasi.getKitap().getAd());
        System.out.println("Kopya ID: " + kitapKopyasi.getKopyaId());
        System.out.println("Ödünç Tarihi: " + oduncTarihi);
    }
}
