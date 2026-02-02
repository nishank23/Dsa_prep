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
        List<Integer> myList = new ArrayList<>();
        postOrder(root,myList);
        return myList;
    }
    public void postOrder(TreeNode root,List<Integer> myList){
        if(root==null){
            return;
        }
        postOrder(root.left,myList);
        postOrder(root.right,myList);
        myList.add(root.val);


    }
}