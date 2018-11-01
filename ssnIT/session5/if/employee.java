class Employee
 {
	public static void main(String args[])
  {
 	int salary=60000;
   if(salary>100000)
    {
	System.out.println("he is the managing director");
  }
	else if(salary>50000&&salary<10000)
	{
	System.out.println("he is team leader");
        }
	else 
	{
	System.out.println("he is employee");
        }
	if(salary<0)
	{
	System.out.println("invalid salary");
  }
 }
}