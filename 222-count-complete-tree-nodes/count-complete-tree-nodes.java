class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

    //     int leftH = getLeft(root);   
    //     int rightH = getRight(root); 

    //     if (leftH == rightH) {
            
    //         return (1 << leftH) - 1; // 2^leftH - 1
    //     }

      
    //     return 1 + countNodes(root.left) + countNodes(root.right);
    // }

    // private int getLeft(TreeNode node) {
    //     int h = 0 ;
    //     while (node != null) {
    //         h++;
    //         node = node.left;
    //     }
    //     return h;
    // }

    // private int getRight(TreeNode node) {
    //     int h = 0;
    //     while (node != null) {
    //         h++;
    //         node = node.right;
    //     }
    //     return h;

    return countNodes(root.left)+countNodes(root.right)+1;
    }
}