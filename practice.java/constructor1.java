
class Test{
	Test(){
		this(5); 
		System.out.println(10);
	}
	
	Test(int x){
		this(15,25); 
		System.out.println(20);
	}
	Test(int x, int y){
		System.out.println(30);
	}
	public static void main(String[] args){
		Test t = new Test();
	}
}
