
public class Main {

	public static void main(String[] args) {
		// Tür dönüşümleri
		
		// String tipinden int tipine dönüştürme
		String a="5";
		int b=Integer.valueOf(a);
		int c=Integer.parseInt(a);
		System.out.println("string "+(a+5));
		System.out.println("integer "+(b+5));
		System.out.println("integer "+(c+5));
		
		
		
		// int tipinden String tipine dönüştürme
		int sayiNumber=21;
		String sayiString=String.valueOf(sayiNumber);
		System.out.println("string "+(5+sayiString));
		
		
		
		
		// Double tipinden int tipine dönüştürme
		double doubleSayi=5.50;
		int integerSayi=(int)doubleSayi;
		System.out.println(integerSayi);
		
		
		
		
		// int tipinden double tipine dönüştürme
		int intSayi1=5;
		double doubleSayi1=(double)intSayi1;
		System.out.println(doubleSayi1);
		
		
		
		
		// Float tipinden long tipine dönüştürme
		float floatSayi1=5.12f;
		long longSayi1=(long)floatSayi1;
		System.out.println(longSayi1);
		
		
		
		
		// long tipinden float tipine dönüştürme
		long longSayi2=5;
		float floatSayi2=(float)longSayi2;
		System.out.println(floatSayi2);
		
		
		
		// long tipinden string tipine dönüştürme
		long longSayi3=5;
		String stringSayi2=String.valueOf(longSayi3);
		System.out.println("string "+(stringSayi2+5));
		
		
		
		
		
		// float tipinden string tipine dönüştürme
		float floatSayi3=5.5f;
		String stringSayi3=String.valueOf(floatSayi3);
		System.out.println("string "+(stringSayi3+2.8));
		
		
		
		
		// byte tipinden string tipine dönüştürme
		byte byteSayi=55;
		String stringSayi6=Byte.toString(byteSayi);
		System.out.println("string "+stringSayi6+9);
	}

}
