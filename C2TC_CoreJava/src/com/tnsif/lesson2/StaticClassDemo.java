package com.tnsif.lesson2;
class Outer
{
	static Integer firstNumber = 100;
	static class Inner
	{
		void displayNumber()
		{
			System.out.println("Number is "+firstNumber);
		}
	}
}
public class StaticClassDemo {
	
		// TODO Auto-generated method stub
		
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.displayNumber();

		// TODO Auto-generated method stub

	}

}
