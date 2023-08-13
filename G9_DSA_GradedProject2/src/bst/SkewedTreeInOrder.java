package bst;

public class SkewedTreeInOrder {

    public static void inOrderTraversal(Node root) {
        if (root != null) {
        	
        	inOrderTraversal(root.right);
        	
        	inOrderTraversal(root.left);
            
            System.out.print(root.data + " ");
            
        }
    }
}
