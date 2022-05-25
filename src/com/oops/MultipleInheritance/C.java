package com.oops.MultipleInheritance;



public class C extends A{
	//suppose C extends A,B then which show() will be call that is why classes does not support with multiple inheritance

	public static void main(String[] args) {
		C  c = new C();
		c.show();//calling show() from class A
	}
}
