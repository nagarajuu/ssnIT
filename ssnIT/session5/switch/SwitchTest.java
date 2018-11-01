class SwitchTest{
	public static void main(String args[]){
        char operation='S';
	int x=10,y=5,z;
	
	switch(operation)

	{
      case 'A':
	z=x+y;
	System.out.println(z);
	break;
      case 'S':
	z=x-y;
	System.out.println(z);
	break;

      case 'M':
	z=x*y;
	System.out.println(z);
	break;
      case 'D':
	z=x/y;
	System.out.println(z);
	break;
      default:
	System.out.println("invalid instruction");
	}     

}
}