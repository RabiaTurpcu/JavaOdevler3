package javaBesinciOdev;

import java.util.Scanner;

public class DorduncuSoru {
	
//	4) Kullanıcıdan aldıgınız 5 basamaklı sayının 
//	rakamlarının toplamını 
//	yazdıran programi for döngüsü ile yazınız
	
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5 basamakli sayi giriniz");
		
		int besbasamakli = scan.nextInt();
		
		int toplam = 0;
		
		for(int i = 0; i <5; i++) {
			
			toplam = toplam + besbasamakli%10;
			
			//neden toplam + yapiyoruz? 
			
			besbasamakli /=10;
			
			
			
			
			
		}
		System.out.println("Sayinin basamaklari toplami=  " + toplam);
		
		
		
		
	}

}
