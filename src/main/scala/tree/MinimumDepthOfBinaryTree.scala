package tree

import damo.TreeNode

/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its minimum depth = 2.
 */
object MinimumDepthOfBinaryTree {
  def minDepth(root: TreeNode): Int = {
    if(root == null) return 0
    if(root.left == null)
      minDepth(root.right)
    else if(root.right == null)
      minDepth(root.left)
    else math.min(minDepth(root.left),minDepth(root.right)) + 1
  }
}
