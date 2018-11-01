class DivRun implements Runnable{	
	public long arithematicOperation(int a , int b){
		return (a/b);
	}
}

class DivRunTest{
	public static void main(String ar[]){
		
		DivRun runnable = new DivRun();
		System.out.println(runnable.arithematicOperation(24,12));
	}
}