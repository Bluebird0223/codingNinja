/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        changeToDepthTree(root,0);
	}
    
    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth)
    {
        if (root==null)
        {
            return;
        }
        root.data=depth;
        changeToDepthTree(root.left,depth+1);
        changeToDepthTree(root.right,depth+1);
	}

}
