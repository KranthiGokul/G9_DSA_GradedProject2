package bst;

public class Driver{
	
	public static void main(String[] args) {
				
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);
		
		Node skewedRoot = Converter.convertToSkewedTree(root);
		
		System.out.println("Node values in ascending order :");
		SkewedTreeInOrder.inOrderTraversal(skewedRoot);
	 }
}
