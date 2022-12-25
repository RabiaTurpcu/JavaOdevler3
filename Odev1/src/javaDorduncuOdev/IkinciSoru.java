package javaDorduncuOdev;

import java.util.Scanner;

public class IkinciSoru {

	
	//	
//	Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a 
//	harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - ikisi de yoksa
//	“Girdiginiz isim a veya Z harfi icermiyor” yazdirin

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isim giriniz");
		
		String isim = scan.nextLine();
		
		if(isim.contains(("a"))) {
			
			System.out.println("Girdiginiz icin 'a ' harfini iceriyor");}
		
			
			else if (isim.contains("Z")) {
				
				System.out.println("Girdiginiz harf 'Z' harfini iceriyor");
			}
			else {
				System.out.println("Girdiniz isim a veya Z harfini icermiyor");
			}
			
			
		
		
	}
}
