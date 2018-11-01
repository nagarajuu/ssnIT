class AddRun implements Runnable{	
	public long arithematicOperation(int a , int b){
		return (a+b);
	}
}

class AddRunTest{
	public static 
void main(String ar[]){
		
		AddRun runnable = new AddRun();
		System.out.println(runnable.arithematicOperation(10,20));
	}
}