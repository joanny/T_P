package com.iut.LIFO;



public class Main {
	public static void main(String[] args) {
	 
		Lifo<Integer> nt = new Lifo<Integer>();	
		nt.push(1);
		nt.push(2);
		nt.push(3);nt.push(4);
		System.out.println(nt.pop());
		System.out.println(nt.pop());
		 
	}
}
