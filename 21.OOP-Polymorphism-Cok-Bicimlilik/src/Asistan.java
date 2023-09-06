//abstract sınıf  tanımlanırsa bu sınıftan nesne üretilemez
public  class Asistan extends Akademisyen{
	protected String yuksekLisans;

	public String getYuksekLisans() {
		return yuksekLisans;
	}
	//abstract metot tanımlanırsa alt sınıflar bu metotu kullanmak zorundadır
	public  void derseGir(int dersSaati) {
		System.out.println("asistan saat : "+dersSaati+"'da derse giris yapti");
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	public Asistan(String adSoyad, String eposta, String telephone, String bolum, String gorevlerString,
			String ders, String yuksekLisans) {
		super(adSoyad, eposta, telephone, bolum, gorevlerString, ders);
		this.yuksekLisans = yuksekLisans;
}
}
