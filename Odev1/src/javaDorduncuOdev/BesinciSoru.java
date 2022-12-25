package javaDorduncuOdev;

import java.util.Scanner;

public class BesinciSoru {
	
//	Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre 
//	basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
//	yazdirin 
//	- Ilk harf buyuk harf olmali 
//	- Son harf kucuk harf olmali 
//	- Sifre bosluk icermemeli 
//	- Sifre uzunlugu en az 8 karakter olmali
	
	public static void main(String[] args) {
		
		System.out.println("Bir sifre giriniz");
		
		Scanner scan = new Scanner(System.in);
		
		String sifre = scan.nextLine();
		
		boolean sart1 = sifre.startsWith(sifre.toUpperCase()) ;
		
		boolean sart2 = sifre.endsWith(sifre.toLowerCase());
		
		boolean sart3 = !sifre.contains(" ");
		
		boolean sart4 = sifre.length() >=8;
		
		if(sart1==sart2) {
			
			if(sart2==sart3);
			
			if(sart3==sart4);
			
			System.out.println("Sifreniz basariyla olusturuldu");
			
		}
		
		else {
			
			System.out.println("Islem basarisiz, lutfen yeni bir sifre girin");
		}
		
		
		
		
	}
	
}
