/***  Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example 1:
 *
 * Input: root = [1,2,2,3,4,4,3]
 * Output:
 *
 * Example 2:
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 */

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        return areNodeMirror(root?.left, root?.right)
    }

    private fun areNodeMirror(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }
        if (left != null && right != null && left.value == right.value) {
            return areNodeMirror(left.left, right.right)
                    && areNodeMirror(left.right, right.left)
        }
        return false
    }
}