
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, target, k);
        return result;
    }

    private int dfs(TreeNode node, TreeNode target, int k) {
        if (node == null) return -1;

        
        if (node == target) {
            subtree(node, k);
            return 0;
        }

     // target in left subtree
        int left = dfs(node.left, target, k);
        if (left != -1) {
            if (left + 1 == k) {
                result.add(node.val);
            } else {
                subtree(node.right, k - left - 2);
            }
            return left + 1;
        }

           int right = dfs(node.right, target, k);
        if (right != -1) {
            if (right + 1 == k) {
                result.add(node.val);
            } else {
                subtree(node.left, k - right - 2);
            }
            return right + 1;
        }

        // Case 4: target not found
             return -1;
    }

    // Step 2: Collect nodes downward at distance k
    private void subtree(TreeNode node, int dist) {
           if (node == null) return;
      
        if (dist == 0) {
            result.add(node.val);
              return;
        }

        subtree(node.left, dist - 1);
        subtree(node.right, dist - 1);
    }
}