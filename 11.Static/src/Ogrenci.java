
public class Ogrenci {
	private long id;
	private String ad;
	private String soyad;
	// static değişken tanımı 
	public static String numara;
	public String numara2;
	
	// static metot tanımlama
	// static bir metot'un içerisinde static olmayan bir şey kullanılamaz/erişilemez.
	public static void numaraYazdir() {
		System.out.println("numara : "+ numara);
	}
	// ancak static olamayan bir metot'un içerisinde static olan bir şey kullanılabilir/erişilebilir.
	public void ogrenciBilgiler() {
		System.out.println("id : "+ getId());
		System.out.println("id : "+ getAd());
		System.out.println("id : "+ getSoyad());
		numaraYazdir();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
}
