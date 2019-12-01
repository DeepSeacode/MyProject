package tree

import damo.TreeNode

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
object ConvertSortedArrayToBinarySearchTree {
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    if(nums == null || nums.isEmpty) return null
    if(nums.length == 1) return new TreeNode(nums(0))
    val mid = nums.length/2
    val head = new TreeNode(nums(mid))
    head.left = sortedArrayToBST(nums.slice(0,mid))
    head.right = sortedArrayToBST(nums.slice(mid+1,nums.length))
    head
  }
}
