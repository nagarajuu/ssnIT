import Mypackage.*;
class SpecifierTest extends Specifier
{
 public static void main(String args[])
{
    Specifier test=new Specifier();
     test.a=100;
    System.out.println(test.a());
    Specifier obj=new Specifier();
    obj.setCh="Theja";
  System.out.println(obj.getCh());
}
}