class Outer{
	 int a=10;
		class Inner{
			public void display(){
				System.out.println("Outer ref value:" +a);
	}
      }
}

class MemberInnertest{
   public static void main(String ar[]){
        Outer outer=new Outer();
         Outer.Inner inner=outer.new Inner();
         inner.display();
	
	}
}