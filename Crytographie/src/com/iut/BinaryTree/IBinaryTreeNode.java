package com.iut.BinaryTree;

public interface IBinaryTreeNode {

	public Node getParent();
	public Node getLeftChild();
	public Node getRigthChild();
	public Node getGrandParent();
	public Node getUncle();
	public boolean isSimplePoint();
	public boolean isDoublePoint();
	public boolean isLeafPoint();
	public String getPath();
	public String getNodeString();
}
