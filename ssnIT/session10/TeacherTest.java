class Teacher{
	public void Display(int a){
		System.out.println("Display a:"+a);
		
              }
             }
class Subject extends Teacher{
          public void Display(String sub){
                System.out.println("Display Subject: "+sub);
	
		}
           }
class TeacherTest{
	public static void main(String args[]){
                Subject obj=new Subject();
		obj.Display("physics");
		Teacher obj1=new Teacher();
		obj1.Display(1);
                  
		}
              }

