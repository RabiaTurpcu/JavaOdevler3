package javaBesinciOdev;

import java.util.Scanner;

public class YedinciSoru {
	
//	7) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 
//	0’a basmasini soyleyin. 
//	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif 
//	sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int  toplam,miktar = 0;
		int sayi = 1;
		
		do {
			System.out.println("Pozitif sayi giriniz");
			
			sayi = scan.nextInt();
			
			if(sayi==0) {
				//System.out.println("Sifir girdiniz");
				
			
		}	
		
			//toplam += sayi;
			miktar++;
			
			 
		
		}while (sayi>0);
				
		 System.out.println("Toplamda " + miktar + " sayi girdiniz");
		 
		 //System.out.println("Girdiginiz sayilarin toplami= " + toplam);

		 //Sayilarin toplamini yazdiramadim??
		}
	
	
	}

