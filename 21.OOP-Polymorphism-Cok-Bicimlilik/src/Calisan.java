
public class Calisan {
	public String adSoyad,eposta,telephone;
	public Calisan(String adSoyad, String eposta, String telephone) {
		this.adSoyad = adSoyad;
		this.eposta = eposta;
		this.telephone = telephone;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public static int getGirisSayisi() {
		return girisSayisi;
	}
	public static void setGirisSayisi(int girisSayisi) {
		Calisan.girisSayisi = girisSayisi;
	}
	static int girisSayisi=0;
	//sadece alt sınıfların kullanmasını istediğimiz değişkenlere protected eişim belirleyicisi atanır
	protected int giris() {
		System.out.println(this.adSoyad+" giris yapti giris sayisi : "+ (Calisan.girisSayisi+1));
		return Calisan.girisSayisi++;
	}
	//polimorfizm
	public static void listele(Calisan[] girisYapanlar) {
		for(Calisan girisYapan:girisYapanlar) {
			System.out.println(girisYapan.giris());
		}
	}
}
