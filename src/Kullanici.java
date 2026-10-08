public class Kullanici {
    private String kullaniciId;
    private String adSoyad;

    public Kullanici(String kullaniciId, String adSoyad) {
        this.kullaniciId = kullaniciId;
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKullaniciId() {
        return kullaniciId;
    }
}
