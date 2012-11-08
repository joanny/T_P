package com.iut.LIFO;

 

public class Lifo<T> implements ILifo<T> {

	private int size;
	private Item premierItem;
	private Item dernierItem;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Item getPremierItem() {
		return premierItem;
	}

	public void setPremierItem(Item premierItem) {
		this.premierItem = premierItem;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
 
	@Override
	public Item pop() {		 
		Item b = dernierItem.getItemSuivant();
		
		while (b != null){
			if ( b.getItemSuivant() != null)
				b = b.getItemSuivant(); 
			 
		}
		return b;
	}

	@Override
	public void peek() {

	}

	@Override
	public boolean isEmpty() {

		return this.getSize() >= 0 ? false : true;
	}

	@Override
	public void push(T t) {
		
		Item o = this.dernierItem;
		this.dernierItem = new Item() ;
		
		 
		this.dernierItem.contenu = t;
		this.dernierItem.setItemSuivant(null);
		 
		if (isEmpty())
			 this.premierItem = this.dernierItem;
		else
			this.dernierItem.setItemSuivant(o);
		 
		this.size++;
	}


	public Lifo() {
		super();
		this.size = 0;
		this.premierItem = null;
		this.dernierItem = null;
	}

	/**
	 * Item
	 */
	public class Item {

    	private Item ItemSuivant;
		private T contenu;

		public Item(Item ItemPrecedent, Item ItemSuivant,
				T contenu) {
			super();
			 
			this.ItemSuivant = ItemSuivant;
			this.contenu = contenu;
		}

		public Item(T contenu) {
			super();
			this.contenu = contenu;
			this.ItemSuivant = new Item();
	 
		}

		public Item() {
			super();
		}

	 

		@Override
		public String toString() {
			return "Item [contenu=" + contenu + "] v";
		}

	 

		public Item getItemSuivant() {
			return ItemSuivant;
		}

		public void setItemSuivant(Item ItemSuivant) {
			this.ItemSuivant = ItemSuivant;
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