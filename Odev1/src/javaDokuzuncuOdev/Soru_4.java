package javaDokuzuncuOdev;

import java.util.Scanner;

public class Soru_4 {
//	4. Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad” 
//	seklinde selamlayin. Tc kimlik numarasini talep edin ve kullaniciya 
//	tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
//	16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi 
//	gorunecek sekilde yazdirin(**** ****  **** 5434) .Tum islemleri 
//	StringBuilder kullanarak yapiniz. Bu programin en basinda zamani 
//	alin ve islemler tamamlaninca tekrar zaman alin ve arada gecen 
//	sureyi ekrana “Islemler ..... surede tamamlandi.” Ibaresini gosterip 
//	programi tamamlayin

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("ad-soyad giriniz");
		
		StringBuilder isim = new StringBuilder(scan.nextLine());
		
		System.out.println("Hosgeldin " + isim);
		
		System.out.println("Tc kimlik numaranizi giriniz");
		
		StringBuilder tc = new StringBuilder(scan.nextInt());
		
		
		
			
			System.out.println(tc.charAt(1));
			//01234567891
		  //  -   -    -
		
		

		
		
	}
}
