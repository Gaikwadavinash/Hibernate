package com.nt.comps;
public class Test {
private int a=10;
private int b=20;
static {
	System.out.println("Test static block");
}
public Test() {
System.out.println("0-paramConstructor TestClass()");
}
@Override
public String toString() {
	return "Test [a=" + a + ", b=" + b + "]";
}

}
