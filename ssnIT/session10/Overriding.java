class Teacher{
	public void show(String sub){
		System.out.println("teach a sub:"+sub);
		}
	}
class Student extends Teacher{
	public void show(String branch){
		System.out.println("he/she belongs to:"+branch);
		}
	}
class Overriding{
	public static void main(String ar[]){
		Student a=new Student();
		a.show("computer science");
		Teacher b=new Teacher();
		b.show("java");
		}
	}