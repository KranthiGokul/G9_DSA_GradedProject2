package bst;

public class Converter {
	
	public static Node convertToSkewedTree(Node root) {
        if (root == null) {
            return null;
        }
        Node newRoot = null;
        while (root != null) {
        	Node rightChild = root.right;
            root.right = newRoot;
            newRoot = root;
            root = rightChild;
        }
        return newRoot;
    }
}