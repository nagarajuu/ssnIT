class Car{
	void display(){
		System.out.println("In Car:: Display");
	}
}
class SwiftCar extends Car{
	void display(){
		System.out.println("In SwiftCar:: Display");
	}
}
class SkodaCar extends Car{
	void display(){
		System.out.println("In SkodaCar:: Display");
	}
}
class OverrideTest{

	public static void main(String ar[]){
		Car car = new SkodaCar();
		car.display();
	}
}