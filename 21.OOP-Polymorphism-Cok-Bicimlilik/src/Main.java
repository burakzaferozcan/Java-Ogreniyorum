 
public class Main {

	public static void main(String[] args) {
		Calisan c = new Calisan("asd", "asd", "asdsad");
		//abstarct tanımlandığında sınıftan nesne üretilemez
		//Akademisyen a = new Akademisyen("burak", "zafer", "ozcan", "maymun", "esek", "sigir");
		Memur m = new Memur("jfks","sq@gmail.com","555","vds","qweqwe");
		Asistan asistan = new Asistan("pls","dasfas","fdgdfg","fdgdsf","fdbfdg","dsas","sd");
		OgretimUyesi ogretimUyesi = new OgretimUyesi("mahmut","m@gmail.com","000","CENG","hoca","ceng 102","docent");

		
		//polimorfizm
		Calisan[] girisListesi= {c,m,ogretimUyesi};
		Calisan.listele(girisListesi);
		//abstarct
		asistan.derseGir(10);
	}

}
