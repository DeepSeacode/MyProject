package tree

import damo.TreeNode

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 *
 * But the following [1,2,2,null,3,null,3] is not:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 */
object SymmetricTree {
  def isSymmetric(root: TreeNode): Boolean = {
    if(root == null) return true
    isSymmetric(root.left,root.right)
  }
  def isSymmetric(left:TreeNode,right:TreeNode):Boolean ={
    if(left == null && right == null) return true
    if(left == null || right == null) return false
    if(left.value != right.value) return false
    isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left)
  }
}
