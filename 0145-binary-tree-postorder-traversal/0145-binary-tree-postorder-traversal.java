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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null){
                st1.push(root.right);
            }
            
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }
}

// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         if(root!=null){
//             ans.addAll(postorderTraversal(root.left));
//             ans.addAll(postorderTraversal(root.right));
//             ans.add(root.val);
//         }
//         return ans;
//     }
// }