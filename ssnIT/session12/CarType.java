
enum Car {
   bmw,tata,audi,toyota,honda
}
public class CarType {
   public static void main(String args[]){
      Car c;
      c = Car.tata;
      switch(c) {
         case bmw:
            System.out.println("You choose bmw");
            break;
         case tata:
            System.out.println("You choose tata");
            break;
         case audi:
            System.out.println("You choose audi");
            break;
         case toyota:
            System.out.println("You choose toyoto");
            break;
         case honda:
            System.out.println("You choose honda!");
            break;
         default:
            System.out.println("I don't know your car.");
            break;
      }
   }
}