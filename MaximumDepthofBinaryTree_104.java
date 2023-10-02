//  This Java class defines a method `maxDepth` that calculates the maximum depth of a binary tree.
//  It uses recursion to find the maximum depth by comparing the depths of the left and right subtrees 
//  and adding 1 to the deeper subtree's depth. 
// The base case is when the input tree node is null, in which case the depth is 0.
class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}