
public class Guvenlik extends Memur{
	String belge;

	public Guvenlik(String adSoyad, String eposta, String telephone, String departman, String mesai, String belge) {
		super(adSoyad, eposta, telephone, departman, mesai);
		this.belge = belge;
	}
}
