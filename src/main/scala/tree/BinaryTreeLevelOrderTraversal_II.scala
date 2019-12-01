package tree

import damo.TreeNode

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
object BinaryTreeLevelOrderTraversal_II {
  def levelOrderBottom(root:TreeNode): List[List[Int]] = {
    if(root == null)  return List[List[Int]]()

    val contain = if(root.right != null && root.left != null) {
      val con1 = levelOrderBottom(root.right)
      val con2 = levelOrderBottom(root.left)
      if(con1.size < con2.size){
        var i = 0
        var j = con2.size - con1.size
        var con = con2.slice(0,j)
        while (i < con1.size){
          con :+= (con2(j) ::: con1(i))
          i+=1
          j+=1
        }
        con
      }else {
        var i = 0
        var j = con1.size - con2.size
        var con = con1.slice(0,j)
        while (i < con2.size){
          con :+= (con2(i) ::: con1(j))
          i+=1
          j+=1
        }
        con
      }
    }
    else if(root.left != null) {
      levelOrderBottom(root.left)
    }else{
      levelOrderBottom(root.right)
    }
    contain :+ List[Int](root.value)
  }
}
