package com.nt.test;

import java.util.Arrays;

import com.nt.entity.Actor;


public class ClientApp {
public static void main(String[] args) {
try {
@SuppressWarnings("rawtypes")
Class a= Actor.class;
System.out.println(" a Object of data:"+a.toString());
System.out.println(" a Object holded Class Name:"+a.getName());
System.out.println(" a Object holded Class related SuperClass Name:"+a.getSuperclass().getName());
System.out.println(" a object holded class related method defination :"+Arrays.toString(a.getDeclaredMethods()));
System.out.println(" a object holded constructor releated info:"+Arrays.deepToString(a.getDeclaredConstructors()));
Object obj=a.newInstance();
System.out.println("Object data"+obj.toString());
System.out.println("Object data:"+obj.hashCode());
}catch (Exception e) {
e.printStackTrace();
}
	}

}
