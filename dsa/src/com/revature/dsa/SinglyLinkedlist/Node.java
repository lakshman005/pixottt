package com.revature.dsa.SinglyLinkedlist;

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "|" + data + "| -> ";
	}
	public static void main(String[] args) {
		Node ans = new Node(5);
		System.out.println(ans);
		Node node1 = new Node(20);
		System.out.println(node1.getData());
		ans.setNext(node1);
		System.out.println(ans.getNext());
		
		
		
		Node node2 = new Node(35);
		node1.setNext(node2);
		System.out.println(node1.getNext());
		
		
	}
	
	
	
	

}



