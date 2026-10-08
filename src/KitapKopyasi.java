public class KitapKopyasi {
    private String kopyaId;
    private boolean durum; 
    private Kitap kitap;

    public KitapKopyasi(String kopyaId, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.durum = true;
        this.kitap = kitap;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public String getKopyaId() {
        return kopyaId;
    }
}
