package com.tnsif.lesson2;

public class StaticBlockDemo {
	static {
		System.out.println(" static block");
	}
	/* this line executes 2nd */
	void displayOutput()
	{
		System.out.println("line one");
	}

	public static void main(String[] args) {
		StaticBlockDemo obj = new StaticBlockDemo();
		obj.displayOutput();
		/* this line executes last*/
		System.out.println("line two");
		// TODO Auto-generated method stub

	}

}
