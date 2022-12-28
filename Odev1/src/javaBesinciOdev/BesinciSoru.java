package javaBesinciOdev;

import java.util.Scanner;

public class BesinciSoru {
//	
//	5) Kullanicidan baslangic ve bitis degerlerini alin. 
//	Baslangic degeri ve bitis 
//	degeri dahil aradalarindaki tum cift tamsayilari 
//	while loop kullanarak 
//	ekrana yazdiriniz.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degeri giriniz");
		
		int baslangic = scan.nextInt();
		
		System.out.println("Bitis degeri giriniz");
		
		int bitis = scan.nextInt();
		
		while( baslangic<=bitis) {
			
			if(baslangic % 2== 0) {
				System.out.println(baslangic);}
				
				baslangic++;
			
			
		}
		
	}

}
