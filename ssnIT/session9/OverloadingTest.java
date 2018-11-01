class Overloading{
	void method(){
		System.out.println("In overloading:: method");
	}
	
	void method(int a){
		System.out.println("In overloading:: method a value:"+a);
	}
	
}
class OverloadingTest{
	public static void main(String ar[]){
		Overloading overloading= new Overloading();
		overloading.method(10);
		

	}

}