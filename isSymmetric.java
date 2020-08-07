/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        // Iterative solution
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         q.add(root);
        
//         while (!(q.isEmpty())) {
//             TreeNode r1 = q.poll();
//             TreeNode r2 = q.poll();
//             if (r1 == null && r2 == null) {
//                 continue;
//             }
//             if (r1 == null || r2 == null) {
//                 return false;
//             }
//             if (r1.val != r2.val) {
//                 return false;
//             }
//             q.add(r1.left);
//             q.add(r2.right);
//             q.add(r1.right);
//             q.add(r2.left);
//         }
//         return true;'
        
        return isMirror (root, root);
    }
    
    // Recursive Solution
    public boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1 == null || r2 == null) {
            return r1 == r2;
        }
        return (r1.val == r2.val) && isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);
    }
}