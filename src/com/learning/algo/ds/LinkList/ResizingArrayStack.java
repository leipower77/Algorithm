package com.learning.algo.ds.LinkList;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {

	public int N = 0;
	public T[] a = (T[]) new Object[1];

	public boolean isEmpty() {
		return N == a.length;
	}

	public void resize(int max) {
		T[] temp = (T[]) new Object[max];
		for (int i = 0; i < N; i++)
			temp[i] = a[i];
		a = temp;
	}

	public void push(T t){
		if(N == a.length)
			resize(2*N);
		a[N++] = t;
	}
	
	public T pop(){
		T t = a[--N];
		if(a.length < N/4)
			resize(N/2);
		return t;
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	class ListIterator implements Iterator<T> {

		private int i = N;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
	
	public static void main(String[] args) {
		ResizingArrayStack<String> rl = new ResizingArrayStack<String>();
		rl.push("123");
		rl.push("234");
		rl.push("345");
		
		for(String s : rl)
			System.out.println();
		Iterator it = rl.iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
	}
}
