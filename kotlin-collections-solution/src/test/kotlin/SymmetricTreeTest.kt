import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SymmetricTreeTest {

    private val underTest: SymmetricTree = SymmetricTree()

    @Test
    fun testTheTreeIsSymmetric() {
        val leaf3 = TreeNode(3)
        val leaf4 = TreeNode(4)
        val node1 = TreeNode(2)
        node1.left = leaf3
        node1.right = leaf4
        val node2 = TreeNode(2)
        node2.left = leaf4
        node2.right = leaf3
        val root = TreeNode(1)
        root.left = node1
        root.right = node2
        assertTrue(underTest.isSymmetric(root))
    }

    @Test
    fun testTheTreeIsNotSymmetric() {
        val leaf3 = TreeNode(3)
        val node1 = TreeNode(2)
        node1.left = null
        node1.right = leaf3
        val node2 = TreeNode(2)
        node2.left = null
        node2.right = leaf3
        val root = TreeNode(1)
        root.left = node1
        root.right = node2
        assertFalse(underTest.isSymmetric(root))
    }

    @Test
    fun testSingleNode() {
        val root = TreeNode(2)
        root.left = null
        root.right = null
        assertTrue(underTest.isSymmetric(root))
    }
}