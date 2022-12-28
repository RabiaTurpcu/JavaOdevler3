package javaBesinciOdev;

import java.util.Scanner;

public class BirinciSoru {
//	1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i 
//	olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara 
//	gore e mail kontrolu yapiniz.
//	   
//	-@ isareti icermiyorsa “gecersiz email” yazdirin
//	-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
//	-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” 
//	yazdirin

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen email adresinizi giriniz");
		String email = scan.nextLine();
		
		yeniMethod(email);
		
		
	}
	
	public static void yeniMethod (String email) {
		
		if(!email.contains("@")) {
			
			System.out.println("Gecersiz email");
		}
		
		else if (!email.contains("@gmail")) {
			
			System.out.println("Lutfen Gmail adresinizi giriniz");
			
			
		}
		
		else if (!email.contains("@gmail.com")) {
			
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}
		
		else {
			
			System.out.println("Dogru email girdiniz");
		}
			
		
		
		
		
		
	
	}
	
	
	
		
		
		
		
		
	}
	
	
	
	
		
		
		
		
		
	
		
		
			
	

