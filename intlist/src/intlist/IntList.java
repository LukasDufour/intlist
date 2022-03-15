package intlist;

import java.util.Arrays;

public class IntList {
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() {}
	
	/** 
	 * @post | result == getElements().length
	 */
	public int getLength() {}
	
	/**
	 * 
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) {}
	
	/**
	 * @post | getLength() == 0
	 */
	public IntList() {}

	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | Arrays.equals(old(getElements()), 0, old(getLength()), getElements(), 0, old(getLength()))
	 */
	public void add(int value) {}
	
	/**
	 * @pre | getLength() > 0
	 * 
	 * @post | getLength() == old(getLength()) - 1
	 * @post | Arrays.equals(old(getElements()), 0, getLength(), getElements(), 0, getLength())
	 */
	public void removeLast() {}
	
}
