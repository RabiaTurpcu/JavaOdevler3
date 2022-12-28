package javaBesinciOdev;

import java.util.Scanner;

public class SekizinciOdev {
//	8) Kullanicidan toplamak icin sayi 
//isteyin ve sayilarin toplami 500’e 
//	ulasincaya kadar sayi istemeye devam edin.
//	Toplam 500’e ulastiginda 
//	veya gectiginde sayilarin toplami ve kac sayi
//	girildigini yazdirin.(do while 
//	dongusu ile

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int  = 0;
		int toplam = 0;
		int miktar = 0;
		
		do {
			System.out.println("Sayi giriniz");
			
			int sayi= scan.nextInt();
			
			
			
			if(toplam>500);{
				
				
			}
			toplam+=sayi;
			miktar++;
		}
		
		
		while (toplam<500);
		
		System.out.println("Sayilarin toplami= " + toplam);
		System.out.println(miktar + "sayi girdiniz");
		
		
		
	}
	
}
