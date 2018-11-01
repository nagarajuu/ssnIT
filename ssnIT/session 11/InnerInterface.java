interface A{
	int i=10;
	interface B{
		public void show();
		}
}
			class C implements A{
		public void show(){
			System.out.println("inner interface i:"+i);
			}	
		}

class InnerInterface{
	public static void main(String ar[]){
		C obj=new C();
		
		obj.show();
	}
}
		