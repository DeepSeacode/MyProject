package tree

import damo.TreeNode

/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 *
 *
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 */
object BalancedBinaryTree {

  def calDeep(root: TreeNode): Int = {
    if(root == null) return 0
    math.max(calDeep(root.left),calDeep(root.right)) + 1
  }

  def isBalanced(root: TreeNode): Boolean = {
    if(root == null) return false
    if(isBalanced(root.left) && isBalanced(root.right))
      math.abs(calDeep(root.left) - calDeep(root.right)) <= 1
    else false
  }
}
