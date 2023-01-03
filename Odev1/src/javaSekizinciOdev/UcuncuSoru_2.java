package javaSekizinciOdev;

import java.util.ArrayList;

public class UcuncuSoru_2 {
	
	public static void main(String[] args) {
		
//		Soru 2:
//			Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop 
//			kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		
		ArrayList <Integer> sayilar = new ArrayList<Integer>();
		
		int kareToplam=0;
		int kare=0;
		
		sayilar.add(8);
		sayilar.add(4);
		sayilar.add(11);
		
		for(Integer sayi: sayilar) {
			//kare = 0;
			//System.out.println(sayi);
			
			kare = sayi * sayi;
			System.out.println( "sayinin karesi = " + kare);
			
				
				kareToplam += kare;
				
			}
				
		
			System.out.println("Sayilarin kareleri toplami = " +kareToplam);
		
//			
		}
		
	}


