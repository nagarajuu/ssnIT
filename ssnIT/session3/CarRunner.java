class Flipkart{

	public static void main(String arg[]){
		Car swift = new Car();
		Car skoda = new Car();
		System.out.println(swift.name+":"+swift.id+":"+swift.speed+":"+swift.isSafety);
		//set variables
		swift.name ="swift";
		swift.id =1;
		swift.speed=80;

		swift.speed=swift.speed-100;
		System.out.println(swift.name+":"+swift.id+":"+swift.speed);

		System.out.println(skoda.name+":"+skoda.id+":"+skoda.speed+":"+skoda.isSafety);
		//set variables
		skoda.name ="skoda";
		skoda.id =1;
		skoda.speed=80;


		System.out.println(skoda.name+":"+skoda.id+":"+skoda.speed+":"+skoda.isSafety);
	
	}
}