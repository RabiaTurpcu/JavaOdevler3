package javaBesinciOdev;

public class IkinciSoru {
	
	
	
//	”InfotechAcademy1234...!’^.+” String ifadesinde,
//	a.kac harf
//	b.kac rakam
//	c.kac ozel karakter oldugunu ekrana yazdıran 
//	karakterSay() metodunu yazınız
	
	public static void main(String[] args) {
		
		String ifade =("InfotechAcademy1234...!’^.+");
		
		karakterSay(ifade);
		
	}
		public static void karakterSay(String ifade) {
			
			int harf = 0;
			int rakam = 0;
			int ozelKarakter= 0;
			
			for (int i=0; i<ifade.length();i++) 
			
			{
				
				char a = ifade.charAt(i);
				
				if (Character.isLetter(a)) harf++;
				
				
				else if (Character.isDigit(a)) rakam++;
				
				
				else ozelKarakter++;
				
			}
			
			System.out.println("Harf sayisi: " + harf);
		    System.out.println("Rakam sayisi: " + rakam);
		    System.out.println("Ozel karakter sayisi: " + ozelKarakter);

					
			
			
		}
		
		
	
	
	
		
		
		
		
				
	}
	
 
	


