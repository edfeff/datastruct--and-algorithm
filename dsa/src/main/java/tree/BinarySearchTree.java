package tree;

/**
 * BST
 * https://www.programiz.com/dsa/breadth-first-search-tree
 * <p>
 * 二进制搜索树是一种数据结构，可快速使我们维护一个排序的数字列表。
 * 之所以称为二叉树，是因为每个树节点最多有两个子节点。
 * 之所以称为搜索树，是因为它可用于在O（log（n））时间中搜索数字的存在。
 * <p>
 * 将二分搜索树与常规二叉树分开的属性是
 * 1. 左子树的所有节点均小于根节点
 * 2. 右子树的所有节点均大于根节点
 * 3.每个节点的两个子树也都是BST，即它们具有上述两个属性
 * <p>
 * <p>
 * 1.检查二进制搜索树中是否存在数字
 * 该算法取决于BST的属性，即每个左子树的值都在root以下，而每个右子树的值都在root以上。
 * 如果该值低于根，则可以肯定地说该值不在正确的子树中；我们只需要在左子树中搜索，
 * 如果该值在根之上，则可以肯定地说该值不在左子树中。我们只需要在正确的子树中搜索。
 */
public class BinarySearchTree {
    static class Node {
        Node left = null;
        Node right = null;
        Integer data = null;

        public Node(Integer data) {
            this.data = data;
        }

        public void setChild(Node left, Node right) {
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    public void insert(Integer value) {
        root = insert(this.root, value);
    }

    /**
     * BST插入
     *
     * @param root
     * @param value
     * @return
     */
    private Node insert(Node root, Integer value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }


    public static void main(String[] args) {
//        testBSTSearch();
        testBstInsert();
    }

    /**
     * 插入测试
     * <pre>
     *      8
     *   3    10
     * 1   6     14
     *    4 7
     *    </pre>
     */
    private static void testBstInsert() {
        BinarySearchTree tree = new BinarySearchTree();
        /*tree.root =*/
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        inOrder(tree.root);
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    /**
     * 搜索测试
     */
    private static void testBSTSearch() {
        Node node = createBST();
        System.out.println(contain(node, 1));
        System.out.println(contain(node, 2));
        System.out.println(contain(node, 3));

        testBSTSearch();

    }

    /**
     * 搜索BST
     *
     * @param root
     * @param data
     * @return
     */
    private static boolean contain(Node root, Integer data) {
        if (root == null || data == null) {
            return false;
        }
        if (data.equals(root.data)) {
            return true;
        } else if (data < root.data) {
            return contain(root.left, data);
        } else {
            return contain(root.right, data);
        }
    }

    private static Node createBST() {
        Node n8 = new Node(8);
        Node n3 = new Node(3);
        Node n10 = new Node(10);
        Node n1 = new Node(1);
        Node n6 = new Node(6);
        Node n14 = new Node(14);
        Node n4 = new Node(4);
        Node n7 = new Node(7);

        n8.setChild(n3, n10);
        n3.setChild(n1, n6);
        n10.setChild(null, n14);
        n6.setChild(n4, n7);

        return n8;
    }

}
