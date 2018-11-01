class MulRun implements Runnable{	
	public long arithematicOperation(int a , int b){
		return (a*b);
	}
}

class MulRunTest{
	public static void main(String ar[]){
		
		MulRun runnable = new MulRun();
		System.out.println(runnable.arithematicOperation(345,243));
	}
}