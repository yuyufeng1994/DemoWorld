package yyf.datastrcture.tree;

public class Node {
	private int id;
	private int parent;
	private String data;

	public Node() {
	}

	public Node(int id, int parent, String data) {
		this.id = id;
		this.parent = parent;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
