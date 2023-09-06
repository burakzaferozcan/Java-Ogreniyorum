
public class OgretimUyesi extends Akademisyen{
String unvan;

public OgretimUyesi(String adSoyad, String eposta, String telephone, String bolum, String gorevlerString, String ders,
		String unvan) {
	super(adSoyad, eposta, telephone, bolum, gorevlerString, ders);
	this.unvan = unvan;
}
public  void derseGir(int dersSaati) {
	System.out.println("ogretim uyesi saat : "+dersSaati+"'da derse giris yapti");
}
	
}
