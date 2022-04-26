package com.revature.dsa.SinglyLinkedlist;

public class Singlelist {
	Node head;
	Node tail;
	public void add(int data) {
		if(head==null) {
			Node node =new Node();
			head=node;
			tail=node;
		}
		else {
			Node node =new Node();
			tail.setNext(node);
			tail=node;
		}
	}
	
	
	public String toString() {
		Node pointer = head;
		String result ="";
		while(pointer!=null) {
			result+=pointer.toString();
			pointer= pointer.getNext();
		}
		return result;
		
		}
		
		
	}
	

