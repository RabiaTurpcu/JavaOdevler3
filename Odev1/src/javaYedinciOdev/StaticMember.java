package javaYedinciOdev;

public class StaticMember {
	
	static int x;
	int y;
	
	StaticMember(){
		
		x+=2;   //x=2
		y++;    //y=1
		
		//Consructor
	}

	static int getSquare() {
		return x*x;
		
		//2*2= 4
		
		//Method
		
	}
	
	public static void main(String[] args) {
		StaticMember sm1 = new StaticMember(); //x=4, y=1
		
		StaticMember sm2 = new StaticMember();//x=4,y=1
		
		int z = sm1.getSquare(); //4*4= 16
		
		System.out.println("-x" + z + "-y" + sm2.y);
	
		//-x  16  -y  1
	}
	
}
