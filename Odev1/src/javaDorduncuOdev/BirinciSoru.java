package javaDorduncuOdev;

public class BirinciSoru {

	
	//Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” 
	//string ifadesini “Java ogrenmek cok guzel.” sekline getirin
	
	
	public static void main(String[] args) {
		
		String str = "Java ogrenmek123 Cok guzel@";
		
		str= str.toLowerCase();
		
		str= str.replaceFirst("j", "J");
		
		str= str.replaceAll("\\d", (""));
		
		str = str.replace('@', '.');
		
		System.out.println(str);
		
		
	}
}
