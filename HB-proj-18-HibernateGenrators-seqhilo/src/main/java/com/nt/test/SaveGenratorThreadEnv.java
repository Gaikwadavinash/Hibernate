package com.nt.test;

public class SaveGenratorThreadEnv {

	public static void main(String[] args) {
	myThread th1= new myThread();
	myThread th2= new myThread();
	myThread th3= new myThread();
th1.start();
	th2.start();
	th3.start();

	}

}
