package com.prowings.onlineinterview;

import java.util.Arrays;

public class CustomArrayList {
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object[] elements;

	public CustomArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}

	public void add(Object value) {
		if (size == elements.length) 
			grow();
		
		elements[size++] = value;
	}

	public Object get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);

		return elements[index];
	}

	public int size() {
		return size;
	}

	private void grow() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

}
