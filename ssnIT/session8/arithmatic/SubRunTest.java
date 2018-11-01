class SubRun implements Runnable{	
	public long arithematicOperation(int a , int b){
		return (a-b);
	}
}

class SubRunTest{
	public static void main(String ar[]){
		
		SubRun runnable = new SubRun();
		System.out.println(runnable.arithematicOperation(50,20));
	}
}