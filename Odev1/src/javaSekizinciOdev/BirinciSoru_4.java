package javaSekizinciOdev;

import java.util.ArrayList;

public class BirinciSoru_4 {
//	Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer 
//	birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir 
//	program yaziniz.
//	Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6 4+5=9 6+7=13==>output:{6,9,13}

	
	public static void main(String[] args) {
		
		
		int sayilar [][] = {{1,2,3}, {4,5}, {6,7}};
		
		int toplam=0;
		
		ArrayList<Integer> yeniDizi = new ArrayList<Integer>();
		
		
		
		
		for(int i=0; i<sayilar.length; i++) {
			
			toplam = 0;
		
			
			for(int j=0; j<sayilar[i].length; j++) {
				
				toplam += sayilar[i][j];
				
				
				
				
			}
		    
			yeniDizi.add(toplam);
			
			System.out.println(toplam);

			}
			
		
		System.out.println(yeniDizi);
	
		
		
		
	}}
	

