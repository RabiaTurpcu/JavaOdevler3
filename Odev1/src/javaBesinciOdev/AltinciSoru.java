package javaBesinciOdev;

import java.util.Scanner;

public class AltinciSoru {
	
//	6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen 
//	sayilari ve toplam kac 
//	tane olduklarini ekranda yazdirin.
//	(while dongusu ile
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		int i = 1;
		
		 while(i< sayi) {
			 
			 if(sayi%i==0) {
		     
		     System.out.println(i);
				 
			 }
			 i++;
			 
			 
		 }
		
		 System.out.println(sayi);
		 
		 //toplam kac sayi oldugunu nasil yazdirabilirim?
		
	}

}
