package com.learning.algo.ds.LinkList;

import java.util.Iterator;

public class LinkStack<T> implements Iterable<T> {

	class Node {
		public T value;
		Node next;
	}

	public Node link = null;
	public int N = 0;

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(T t) {
		Node n = new Node();
		n.value = t;
		n.next = link;
		link = n;
		N++;
	}

	public T pop() {
		if (N == 0)
			return null;
		else {
			link = link.next;
			return link.value;
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {

		Node n = link;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return n != null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			Node cur = n;
			n = n.next;
			return cur.value;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}
		
		

	}
	
	
	public static void main(String[] args) {
		LinkStack<String> ls = new LinkStack<String>();
		ls.push("123");
		ls.push("234");
		ls.push("345");
		
		Iterator it = ls.iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
		System.out.println("**************");
		ls.pop();
		it = ls.iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
		
	}
}
