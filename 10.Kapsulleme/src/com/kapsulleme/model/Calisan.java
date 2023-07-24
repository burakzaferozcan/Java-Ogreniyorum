package com.kapsulleme.model;

public class Calisan {
	private long id;
	private String isim;
	private String soyisim;
	private int maas;
	public Calisan() {
	
	}
	public Calisan(long id, String isim, String soyisim, int maas) {
		this.id = id;
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	//getter setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		if(maas>=1000&&maas<=5000) {
			this.maas = maas;
		}else {
		}
		
	}
	
}
