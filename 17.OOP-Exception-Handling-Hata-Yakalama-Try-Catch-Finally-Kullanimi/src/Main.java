import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Basladi!");
	/*	int a=0;
		try {
			a=2/0;
			System.out.println("Try icerisinde ! ");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		*/
		
		
		
		/*
		int[]arr= new int[3];
		try {
			arr[4]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		*/
		
		
		
		//eğer bir özel hata ismini bilmiyorsak catch kismine Exception e yazmamız yeterli
		int sayi=5;

		Scanner scan=new Scanner(System.in);
		try {
			System.out.print("lutfen bir seyler yaziniz : ");
			sayi=scan.nextInt();
		}catch(Exception e) {
			System.out.println("bir hata var!\n"+e.getMessage()+"\n"+e.toString());
		}finally {
			System.out.println("Finally kismi hata olsa da olamsa da calisir");
		}
		
		System.out.println("Program Bitti!");
	}

}
