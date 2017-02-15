package yyf.java.test;

import java.util.Map;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Aob a = new Aob();
		Aob b = new Aob();
		String c = "abc";
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(Integer.toHexString(b.hashCode()));
		System.out.println(Integer.toHexString(c.hashCode()));
		System.out.println(Integer.toHexString("abc".hashCode()));
		
	}
}
class Aob{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
