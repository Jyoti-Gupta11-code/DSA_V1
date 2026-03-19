class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) 
        {
            return   result;
        }

        Queue<TreeNode> queue   = new LinkedList<>();
        queue.add(root);
        queue.add(null)  ; 

        List<Integer>   currentLevel = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {
                result.add(new ArrayList<>(currentLevel));
                currentLevel.clear();

                if(!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {

                  currentLevel.add(node.val);

                    if    (node.left != null)
                    queue.add(node.left);

                   if (node.right != null)
                    queue.add(node.right);
            }
        }

           return result;
    }
}