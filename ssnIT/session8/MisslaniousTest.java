class Misslanious extends MisslaniousSuper{

	Misslanious(){
		super(10);
	}
	static int i=10;
	int j=10;
	final double pi =3.14;	
	
{
		System.out.println("In Instance Block");
	}	
}

class MisslaniousTest{
	
	
	public static void main(String ar[]){
		System.out.println(Misslanious.i);
		Misslanious misslanious  = new Misslanious();
		System.out.println(misslanious.j);
		//misslanious.pi =20.0;
		System.out.println(misslanious.pi);
	}

	static{
		System.out.println("In Static Block");
	}
	
}