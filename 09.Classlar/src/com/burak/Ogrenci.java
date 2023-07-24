package com.burak;

public class Ogrenci {
	public int id;
	public String isim;
	public String soyisim;
	private String cinsiyet;
	 
	
	// metot overloading

	
	public Ogrenci(int id,String isim,String soyisim) { //constructor (yapıcı metot)
		System.out.println("ogrenci sinifinin constructor metotu calisiyor");
		// this : suan üzerinde calistigim class
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
	}
	public Ogrenci() {
		System.out.println("method overloading calisiyor...");
	}
}
