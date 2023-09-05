//interface sınıf tanımlama
public interface ICalisan {
	// interface sınıflarda sadece değiştirilemez değişkenler oluşturulabilir - final
	final String okul="THKU";
	// interface sınıfların alt sınıflarında bu metotları tanımlama zorunludur
	public void giris();
	public void cikis();
	public boolean yemek(int saat);
}
