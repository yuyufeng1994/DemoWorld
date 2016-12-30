package yyf.datastrcture.tree.manytree;

import java.util.ArrayList;
import java.util.List;

import yyf.datastrcture.tree.Node;

/**
 * 多叉树节点
 * 
 * @author Administrator
 *
 */
public class ManyTreeNode {
	private Node node;
	private List<ManyTreeNode> childList;

	public ManyTreeNode(Node node) {
		this.node = node;
		this.childList = new ArrayList<ManyTreeNode>();
	}

	public ManyTreeNode(Node node, List<ManyTreeNode> childList) {
		this.node = node;
		this.childList = childList;
	}

	public Node getData() {
		return node;
	}

	public void setData(Node node) {
		this.node = node;
	}

	public List<ManyTreeNode> getChildList() {
		return childList;
	}

	public void setChildList(List<ManyTreeNode> childList) {
		this.childList = childList;
	}
}
