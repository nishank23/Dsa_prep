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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int levelLength = queue.size();
            for(int i =0;i<levelLength;i++){
                TreeNode curr = queue.removeFirst();
                if(i==levelLength-1){
                    myList.add(curr.val);
                }

                if(curr.left!=null){
                    queue.add(curr.left);
                }

                if(curr.right!=null){
                    queue.add(curr.right);
                }

            }

        }

        return myList;


    }
}