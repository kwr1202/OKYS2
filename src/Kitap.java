public class Kitap {
    private String isbn;
    private String ad;
    private String yazar;

    public Kitap(String isbn, String ad, String yazar) {
        this.isbn = isbn;
        this.ad = ad;
        this.yazar = yazar;
    }

    public String getAd() {
        return ad;
    }
    
    public String getIsbn() {
        return isbn;
    }
}
