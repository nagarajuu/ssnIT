class A{
	void method(){
		System.out.println("In A");
	}
}
class B extends A{
	void method(){
		System.out.println("In B");
	}
}
class Test{
	public static void main(String args[]){
		B b=new B();
		b.method();
	}
}