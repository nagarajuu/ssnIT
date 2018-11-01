class Outer{
  class Inner{
   public void display(){
   System.out.println("In inner");
       }
       }
     }
class MemberInnerTest{
  public static void main(String ar[]){
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
	inner.display();
  }
}