package com.iut.stack;


public class Stack<T> implements IStack<T> {

	private int size;
	private Element premierElement;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Element getPremierElement() {
		return premierElement;
	}

	public void setPremierElement(Element premierElement) {
		this.premierElement = premierElement;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Element pop() {
		
		Element el = this.premierElement;	 
		this.premierElement = this.premierElement.getElementSuivant();
		return el;
	}

	@Override
	public void peek() {

	}

	@Override
	public boolean isEmpty() {

		return this.getSize() >= 0 ? false : true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void push(T t) {
		Element n = new Element(t); 
		Element o = this.premierElement;
		this.premierElement = new Element();
		this.premierElement.contenu = (T) n;
	    this.premierElement.setElementSuivant(o);
		this.size++;
	}
	 
 

	public Stack() {
		super();
		this.size = 0;
		this.premierElement = null;
	}

	/**
	 * element
	 */
	public class Element {

		
		private Element elementSuivant;
		private T contenu;

		public Element( Element elementSuivant,
				T contenu) {
			super();
			
			this.elementSuivant = elementSuivant;
			this.contenu = contenu;
		}

		 

		public Element(T contenu) {
			super();
			this.contenu = contenu;
			this.elementSuivant = new Element();
		 
		}

		public Element() {
			super();
		}

	 

		@Override
		public String toString() {
			return "Element [contenu=" + contenu + "] v";
		}

	 

		public Element getElementSuivant() {
			return elementSuivant;
		}

		public void setElementSuivant(Element elementSuivant) {
			this.elementSuivant = elementSuivant;
		}

		public Object getContenu() {
			return contenu;
		}

		public void setContenu(T contenu) {
			this.contenu = contenu;
		}

 

	}

	/**
	 * 
	 */

}