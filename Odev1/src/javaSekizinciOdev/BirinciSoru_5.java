package javaSekizinciOdev;

import java.util.Scanner;

public class BirinciSoru_5 {
	
	//Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cumle giriniz");
		
		String cumle = scan.nextLine();
		
		int bosluk;
		
		String[] yeniArray = cumle.split(" ");
		
		for(String b:yeniArray) {
			
			System.out.println(b);}
			
		System.out.println(yeniArray.length);
			
			
				
			}
		}
		
		
		
		
			
			
		
	

