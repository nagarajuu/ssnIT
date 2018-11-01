

class BookStore
{
	public static void main(String args[])
	{
	
	Book C = new Book();
	Book Cpp = new Book();
	Book Java = new Book();
	Book Dbms = new Book();

	  C.BookName="C";
 	  C.Bookid=1;
	  C.Bookprice=100;
	  C.pages=435;
	 System.out.println(C.BookName+":"+C.Bookid+":"+C.Bookprice+":"+C.pages);
	C.Bookprice=C.Bookprice-50;
	 System.out.println(C.BookName+":"+C.Bookid+":"+C.Bookprice+":"+C.pages);
	
	
	 Cpp.BookName="Cpp";
 	 Cpp.Bookid=2;
	 Cpp.Bookprice=200;
	 Cpp.pages=345;
	System.out.println(Cpp.BookName+":"+Cpp.Bookid+":"+Cpp.Bookprice+":"+Cpp.pages);

	Cpp.Bookprice=Cpp.Bookprice-30;
	
        System.out.println(Cpp.BookName+":"+Cpp.Bookid+":"+Cpp.Bookprice+":"+Cpp.pages);
	
	
        
	 Java.BookName="Java";
 	 Java.Bookid=3;
	 Java.Bookprice=450;
	 Java.pages=456;
	System.out.println(Java.BookName+":"+Java.Bookid+":"+Java.Bookprice+":"+Java.pages);
	Java.Bookprice=Java.Bookprice-50;
	
	System.out.println(Java.BookName+":"+Java.Bookid+":"+Java.Bookprice+":"+Java.pages);
        
        
	
	 Dbms.BookName="Dbms";
 	 Dbms.Bookid=4;
	 Dbms.Bookprice=1060;
	 Dbms.pages=135;
	System.out.println(Dbms.BookName+":"+Dbms.Bookid+":"+Dbms.Bookprice+":"+Dbms.pages);
	Dbms.Bookprice=Dbms.Bookprice-60;
	
	System.out.println(Dbms.BookName+":"+Dbms.Bookid+":"+Dbms.Bookprice+":"+Dbms.pages);
	
	
 }
}