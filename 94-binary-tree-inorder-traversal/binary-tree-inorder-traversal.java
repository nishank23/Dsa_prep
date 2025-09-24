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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        inOrder(root,myList);
        
        return myList;
    }
    private void inOrder(TreeNode root,List<Integer> myList){
        if(root==null){
            return;
        }
        inOrder(root.left,myList);
        myList.add(root.val);
        inOrder(root.right,myList);
    }
}