package edu.osu.cs362;



import java.util.*;

public class BinarySearchTree {
    private Node root; // root node
    private int size;  // number of nodes in the tree
    
    public static class Node {
        private  Node left;  // left child
        private  Node right; // right child
        private  Integer info; // data
        	
        Node(Node left, Node right, Integer info){
            this.left = left;
            this.right = right;
            this.info = info;
        }
        Node(Integer info){
            this.info = info;
        }

		public String toString() {
            Set visited = new HashSet();
            visited.add(this);
            return toString(visited);
        }
        
		private String toString(Set visited) {
            StringBuffer buf = new StringBuffer();
            buf.append(" {");
            if (left != null)
                if (visited.add(left))
                    buf.append(left.toString(visited));
                else
                    buf.append("!tree");

            buf.append("" + this.info + "");

            if (right != null)
                if (visited.add(right))
                    buf.append(right.toString(visited));
                else
                    buf.append("!tree");
            buf.append("} ");
            return buf.toString();
        }

        public boolean equals(Object that){
            if (!(that instanceof Node))
                return false;
            Node n = (Node)that;
            if (this.info.compareTo(n.info) != 0)
                return false;
            boolean b = true;
            if (left == null)
                b = b && (n.left == null);
            else
                b = b && (left.equals(n.left));
            if (right == null)
                b = b && (n.right == null);
            else 
                b = b && (right.equals(n.right));
            return b;
        }
    }

    


    public void add(Integer info) {
        if (root == null) {
            root = new Node(info);
        } else {
            Node t = root;
            while (true) {
                if (t.info.compareTo(info) < 0) {
                    if (t.right == null) {
                        t.right = new Node(info);
                        break;
                    } else {
                        t = t.right;
                    }
                } else if (t.info.compareTo(info) > 0) {
                    if (t.left == null) {
                        t.left = new Node(info);
                        break;
                    } else {
                        t = t.left;
                    }
                } else { // no duplicates
                    return;
                }
            }
        }
        size++;
    }

	public int size() {
		return size;
	}

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("{");
        if (root != null) 
            buf.append(root.toString());
        buf.append("}");
        return buf.toString();
    }

    public boolean equals(Object that){
        if (!(that instanceof BinarySearchTree))
            return false;
        BinarySearchTree b = (BinarySearchTree)that;
        if (size != b.size)
            return false;
        if (((root == null) && (b.root != null)) || 
            ((root != null) && (b.root == null)))
            return false;
        if ((root == null) && (b.root == null))
            return true;
        return root.equals(b.root);
    }

}