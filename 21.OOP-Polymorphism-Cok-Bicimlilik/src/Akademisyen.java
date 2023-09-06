
public abstract class Akademisyen extends Calisan{
	 String bolum,gorevlerString;
	 String ders;
	 public abstract void derseGir(int dersSaati); 
	public Akademisyen(String adSoyad, String eposta, String telephone, String bolum, String gorevlerString,
			String ders) {
		super(adSoyad, eposta, telephone);
		this.bolum = bolum;
		this.gorevlerString = gorevlerString;
		this.ders = ders;
	}
	
	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevlerString() {
		return gorevlerString;
	}

	public void setGorevlerString(String gorevlerString) {
		this.gorevlerString = gorevlerString;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public void derseGir() {
		System.out.println("Derse girildi");
	}
	public int giris() {
		System.out.println(this.adSoyad+" giris yapti A kapisindan giris sayisi : "+ (Calisan.girisSayisi+1));
		return Calisan.girisSayisi++;
	}
}


