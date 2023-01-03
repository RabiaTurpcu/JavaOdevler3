package javaSekizinciOdev;

public class BirinciSoru_1 {
	
	//Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir 
	//method yaziniz.
	public static void main(String[] args) {
	
	int sayilar[][]={{1,2,3}, {4,5,6}};

	int carpim;
	carpim = 1;
	for(int i=0; i< sayilar.length; i++) {
		
	for( int j=0; j<sayilar[i].length; j++) {
			
			carpim = carpim * sayilar[i][j] ;
           // System.out.println();
		}
	

		
       
		
	}
	
			System.out.println( carpim);
          
	
	  }
	 }
