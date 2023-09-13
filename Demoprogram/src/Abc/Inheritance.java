package Abc;
import java.io.*;
import java.util.*;

public class Inheritance {
	
	void showInheritance()
	{
		System.out.println("a class method");
		
	}
	class B extends Inheritance
	{
		void showB()
	
	{
		System.out.println("b class method");
		
	}
	}
   public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj1=new Inheritance();
		obj1.showInheritance();
		
		obj1.showInheritance();
		//obj1.showB();
		}
}
}
