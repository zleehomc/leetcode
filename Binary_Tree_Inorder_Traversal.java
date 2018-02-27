/**
 * @Author: hyc
 * @Date:   2018-02-27T19:59:26+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-02-27T20:26:14+08:00
 */


 /**
  * Definition for a binary tree node.
  * public class TreeNode {
  *     int val;
  *     TreeNode left;
  *     TreeNode right;
  *     TreeNode(int x) { val = x; }
  * }
  */
  // 递归
 class Solution {
     List<Integer> list = new ArrayList<>();
     public List<Integer> inorderTraversal(TreeNode root) {
         dfs(root);
         return list;

     }
     public void dfs(TreeNode node){
         if(node == null){
             return;
         }
         if(node.left != null){
             dfs(node.left);
         }
         list.add(node.val);
         if(node.right != null){
             dfs(node.right);
         }
     }
 }
 //非递归
 class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempnode = root;
        stack.push(tempnode);
        while(!stack.isEmpty()){
            while((tempnode = stack.peek()) != null){
                tempnode = tempnode.left;
                stack.push(tempnode);
            }
            stack.pop();
            if (!stack.isEmpty()) {
                tempnode = stack.pop();
                list.add(tempnode.val);
                stack.push(tempnode.right);
            }
        }
        return list;
    }

}
