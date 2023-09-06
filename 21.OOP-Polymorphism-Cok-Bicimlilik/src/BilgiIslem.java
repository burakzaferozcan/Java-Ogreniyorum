
public class BilgiIslem extends Memur {
	String gorev;

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public BilgiIslem(String adSoyad, String eposta, String telephone, String departman, String mesai, String gorev) {
		super(adSoyad, eposta, telephone, departman, mesai);
		this.gorev = gorev;
	}
}
