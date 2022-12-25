package javaDorduncuOdev;

import java.util.Scanner;

public class UcuncuSoru {
	
	//Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu 
	//yazdirin
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		
		String surname = scan.nextLine();
		
		
		
		if(name.length()> surname.length()) {
			System.out.println("Isminiz soyisminizden uzundur");
		}
		
		else if(name.length()< surname.length()) {
			System.out.println("Soyisminiz isminizden uzundur");
			
		}
		
		else {
			
			System.out.println("Isminiz ve soyisminiz ayni uzunluktadir");
		}

		
		
	}
}
