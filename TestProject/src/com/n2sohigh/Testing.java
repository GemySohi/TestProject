package com.n2sohigh;

public class Testing {

	public static void main(String[] args) {

		String str = new String("Hello");
		StringBuilder builder = new StringBuilder("Hello");
		StringBuffer buffer = new StringBuffer("Hello");

		str.concat("Hi.....");
		builder.append("Hi....");
		buffer.append("Hi....");

		System.out.println(str);
		System.out.println(builder);
		System.out.println(buffer);
	}
}
