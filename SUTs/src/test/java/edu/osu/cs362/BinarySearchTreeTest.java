package edu.osu.cs362;

import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTreeTest  {
    @Test
    public void test0() {
    	
		BinarySearchTree t = new BinarySearchTree();
		assertTrue(t.size() == 0);
		assertTrue(t.toString().equals("{}"));

	}
    @Test
    public void test1() {
    	
		BinarySearchTree t = new BinarySearchTree();
		t.add(new Integer(1));
		//System.out.println(t.toString());
		assertTrue(t.toString().equals("{ {1} }"));//1 is added into A

	}
    @Test
    public void test2() {
		BinarySearchTree t = new BinarySearchTree();
		t.add(new Integer(8));
		t.add(new Integer(5));
		assertTrue(t.toString().equals("{ { {5} 8} }"));

	}
	public void testaddWhenSizeOne3() {
		BinarySearchTree t = new BinarySearchTree();
		t.add(new Integer(8));
		t.add(new Integer(8));
		assertTrue(t.toString().equals("{ {8} }"));//1 is added into A
	}

}