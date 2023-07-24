package OOP_Uygulama1;

public class Calisan {
	public int no;
	public String isim;
	public String soyisim;
	public int tecrube;
	public double maas;
	
	public Calisan() {
	
	}
	//ALT+SHIFT+S
	public Calisan(int no, String isim, String soyisim, int tecrube, double maas) {
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.tecrube = tecrube;
		this.maas = maas;
	}

	public void calisanBilgileriGoster() {
		System.out.println("**********calisan bilgileri**********");
		System.out.println("NO : "+no);
		System.out.println("Isim : "+isim);
		System.out.println("Soyisim : "+soyisim);
		System.out.println("Tecrube : "+tecrube);
		System.out.println("Maas : "+maas);
	}
	public void zamYap(int zamDegeri) {
		System.out.println("maasiniza "+zamDegeri+" tl zam yapildi");
		System.out.println("guncel maasiniz "+(maas+zamDegeri));
	}
	public void formatAt(String isletimSistemi,String kim) {
		System.out.println(kim+" suanda "+isletimSistemi+" isletim sistemine format atiyor.");
	}
}
