package com.nt.test;
public class NewInstance {

	public static void main(String[] args) {
try {	
	//Load Class
	Class c=Class.forName(args[0]);
	//Create Object at dynamically at Run time 
Object ob=c.newInstance();
System.out.println("Object Data:"+ob+" "+"Object ClassName:"+ob.getClass()+" "+"Object HashCode:"+ob.hashCode());
}catch(Exception e) {
	e.printStackTrace();
}

	}

}
