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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return ans;
        }
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return ans;
    }
}


//with recursion
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         if(root!=null){
//             ans.add(root.val);
//             ans.addAll(preorderTraversal(root.left));
//             ans.addAll(preorderTraversal(root.right));
//         }
//         return ans;
//     }
// }