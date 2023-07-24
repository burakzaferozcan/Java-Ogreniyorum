package KapsullemeUygulama;

import java.util.Random;

public class TCKN {
	private Long id;
	private String dogumYeri;
	private String tckn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getTckn() {
		return tckn;
	}

	boolean kontrol = true;

	public void setTckn(String tckn) {
		if (tckn.length() == 11) {
			for (int i = 0; i < tckn.length(); i++) {
				char karakter = tckn.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
			}
			if (kontrol) {
				Random random = new Random();
				int giseNo = random.nextInt(100);
				sonucuYazdir("gise no : " + giseNo);
				this.tckn = tckn;
			} else {
				sonucuYazdir("lutfen butun karakterleri rakam olacak sekilde giriniz.");
			}
		} else {
			System.out.println("tc 11 karakter olmak zorundadir");
		}

	}

	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

}
