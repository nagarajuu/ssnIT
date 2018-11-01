class Outer{
	abstract class Inner{
		abstract void display();
	}

}
class AnonymousInnerTest{
	public static void main(String ar[]){
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(){
			@Override
			void display(){
				System.out.println("In Anonymous Inner instance");
			}
		};
		inner.display();
	}
}