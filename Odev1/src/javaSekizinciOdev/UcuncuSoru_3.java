package javaSekizinciOdev;

import java.util.ArrayList;

public class UcuncuSoru_3 {

	public static void main(String[] args) {

//		Soru 3:
//			iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
//			bulunuz. Sonucu ekrana yazdiriniz.
//			Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

		ArrayList<String> canlilar = new ArrayList<String>();

		canlilar.add("kedi");
		canlilar.add("agac");
		canlilar.add("tek hucreli");
		canlilar.add("insan");

		ArrayList<String> hayvanlar = new ArrayList<String>();

		hayvanlar.add("kedi");
		hayvanlar.add("bukalemun");
		hayvanlar.add("orangutan");
		hayvanlar.add("fare");

		int sayac = 0;
		
		for (String canli : canlilar) {

			for (String hayvan : hayvanlar) {
				
				if(canli.equals(hayvan)) {
					
					System.out.println(canli);
					
					sayac++;
				}
				
				
				}

			}
		if(sayac==0) {
			
			System.out.println("Ortak eleman yoktur");
		}
			
			
			
		}
		
		

	}


