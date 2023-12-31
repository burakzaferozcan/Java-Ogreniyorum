
public class HesapMakinesi {
	public int sayi1;
	public int sayi2;
	//sabit tanımlama final deyimi ile tanımlanır sonradan değer değiştirilemez
	final static double  PI=3.14;
	 
	public HesapMakinesi(int sayi1, int sayi2) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
		// sabit tanımlama final deyimi ile tanımlanır sonradan değer değiştirilemez
		// this.PI=5;
	}
	
	public int toplama() {
		return this.sayi1+this.sayi2;
	}
	public int cikarma() {
		return this.sayi1-this.sayi2;
	}
	public int carpma() {
		return this.sayi1*this.sayi2;
	}
	public int bolme() {
		return this.sayi1/this.sayi2;
	}
	public  double area(int r) {
		return HesapMakinesi.PI*Math.pow(r,2);
	}

}
