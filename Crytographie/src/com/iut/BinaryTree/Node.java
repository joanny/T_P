package com.iut.BinaryTree;

public class Node implements IBinaryTreeNode {

	private Node parent;
	private Node leftChild;
	private Node rightChild; 
    private String contenu;
	public Node(Node parent, Node leftChild, Node rightChild , String contenu) {
		super();
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.contenu = contenu;
	}
	public String getContenu() {
		return contenu;
	}
	public Node(String contenu) {
		super();
		this.contenu = contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public Node() {
		super();	 
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	@Override
	public Node getParent() {

		return this.parent;
	}

	@Override
	public Node getLeftChild() {
		return this.getLeftChild();
	}

	@Override
	public Node getRigthChild() {
		return this.getRigthChild();
	}

	@Override
	public String toString() {
		return "Node [contenu=" + contenu + "]";
	}
	@Override
	public Node getGrandParent() {

		return this.parent.getParent();
	}

	@Override
	public Node getUncle() {
		if (this.parent.getParent().getLeftChild().equals(this.parent)) {
			return this.parent.getParent().getLeftChild();
		} else {
			return this.parent.getParent().getRigthChild();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((leftChild == null) ? 0 : leftChild.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result
				+ ((rightChild == null) ? 0 : rightChild.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (leftChild == null) {
			if (other.leftChild != null)
				return false;
		} else if (!leftChild.equals(other.leftChild))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (rightChild == null) {
			if (other.rightChild != null)
				return false;
		} else if (!rightChild.equals(other.rightChild))
			return false;
		return true;
	}

	@Override
	public boolean isSimplePoint() {
		boolean val = false;
		if ((this.parent.getRigthChild() == null)
				&& (this.parent.getRigthChild() != null)) {
			val = true;
		}
		return val;
	}

	@Override
	public String getPath() {

		return null;
	}

	@Override
	public String getNodeString() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isLeafPoint() {

		boolean isleaf = false;

		if (((this.parent.rightChild != null) && (this.parent.leftChild == null))
				|| ((this.parent.rightChild != null) && (this.parent.leftChild == null))) {
			isleaf = true;
		}

		return isleaf;
	}

	public boolean isDoublePoint() {

		boolean isleaf = false;

		if ((this.rightChild != null) && (this.leftChild != null)) {
			isleaf = true;
		}

		return isleaf;
	}

}
