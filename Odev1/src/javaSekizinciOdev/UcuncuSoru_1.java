package javaSekizinciOdev;

import java.util.ArrayList;

public class UcuncuSoru_1 {
	
	public static void main(String[] args) {
		
		
//		Soru 1:
//			Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop 
//	       kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		
		
		ArrayList <Integer> sayilar = new ArrayList<Integer>();
		int carpim=1;
		sayilar.add(3);
		sayilar.add(5);
		sayilar.add(10);
		
		for(Integer sayi: sayilar) {
			
			carpim *= sayi;
			
			
			System.out.println(sayi);
		}
		
		System.out.println("Sayilarin carpimi = " + carpim + " dir");
		
	}
	

}
