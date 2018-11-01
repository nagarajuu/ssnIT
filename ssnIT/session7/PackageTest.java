package com.ssnIt.myPackage;
class PackageTest{
	public static void main(String a[]){
		System.out.println("In Package");
		Test testClass= new Test();
		testClass.a =10;
		System.out.println(testClass);
	}
}
