package com.iut.BinaryTree;
 

public class Main {

	public static void main(String[] args) {
 
		Node pf = new Node("Pierre francois");
		Node gabriel = new Node("Gabriel");
		Node aimer = new Node("aimé");
		Node Jacque = new Node("jacque");
		Node pierre = new Node("pierre");
		Node jean_pierre = new Node("jean pierre");
		Node raymond = new Node("raymond");
		Node marcel = new Node("marcel");
		Node jeanjacque = new Node("jean-jacque");
		Node jeanPaul = new Node("jean-paul");
		Node robert = new Node("robert");
		Node philippe = new Node("philippe");
		
		pf.setLeftChild(gabriel);
		pf.setRightChild(aimer);
		aimer.setLeftChild(Jacque);
		gabriel.setParent(pf);
		gabriel.setLeftChild(Jacque);
		gabriel.setRightChild(pierre);
		
		
		
		System.out.println(pf.getRightChild().getRightChild());
		
	}
}
