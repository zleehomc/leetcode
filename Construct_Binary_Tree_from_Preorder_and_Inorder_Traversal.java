/**
 * @Author: hyc
 * @Date:   2018-01-09T19:34:34+08:00
 * @Email:  514300914@qq.com
 * @Last modified by:   hyc
 * @Last modified time: 2018-01-09T19:35:25+08:00
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
 class Solution {
     public TreeNode buildTree(int[] preorder, int[] inorder) {
         if(preorder == null || preorder.length == 0){
             return null;
         }
         if(inorder == null || inorder.length ==0){
             return null;
         }
         if(preorder.length != inorder.length){
             return null;
         }
         return build(preorder, inorder, 0, 0, inorder.length -1);

     }
     public TreeNode build(int[] preOrder, int[] inOrder, int preIndex, int inStartIndex, int inEndIndex){
         if(preIndex >= preOrder.length || inStartIndex > inEndIndex)
              return null;
         TreeNode preNode = new TreeNode(preOrder[preIndex]);
         int midIndex = lookupindex(inOrder, preOrder[preIndex]);
         if(midIndex > inStartIndex){
             preNode.left = build(preOrder, inOrder, preIndex + 1, inStartIndex, midIndex - 1);
         }
         if(midIndex < inEndIndex){
             preNode.right = build(preOrder, inOrder, preIndex + 1 + midIndex - inStartIndex, midIndex + 1, inEndIndex);
         }
         return preNode;
     }
     public int lookupindex(int inOrder[], int x){
         int j = 0;
         for(int i = 0;i<inOrder.length;i++){
             if(inOrder[i] == x){
                 j = i;
                 break;
             }
         }
         return j;
     }
 }
