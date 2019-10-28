package tree;

/**
 * https://cdn.programiz.com/sites/tutorial2program/files/tree-concept.jpg
 * <p>
 * trees及其变体是一种非常有用的数据结构，具有许多实际应用。
 * - 二进制搜索树（BST）用于快速检查元素是否存在于集合中。
 * - 堆是一种用于堆排序的树。
 * - 现代路由器中使用称为Tries的树的修改版本来存储路由信息。
 * - 最受欢迎的数据库使用B树和T树，这是我们在上面学到的用于存储其数据的树结构的变体
 * - 编译器使用语法树来验证您编写的每个程序的语法。
 * <p>
 * <p>
 * 遍历树意味着访问树中的每个节点。
 * 例如，您可能想在树中添加所有值或找到最大的值。
 * 对于所有这些操作，您将需要访问树的每个节点。
 * 线性数据结构（如数组，堆栈，队列和链表）只有一种读取数据的方法。
 * 但是像树这样的分层数据结构可以以不同的方式遍历。
 * <pre>
 *          1
 *     12       9
 *  5    6
 *  </pre>
 * 先序
 * M L R
 * 1 12 5 6 9
 * <p>
 * 中序
 * L M R
 * 5 12 6 1 9
 * <p>
 * 后序
 * L R M
 * 5 6 12 9 1
 * <p>
 * 层序
 * 1 12 9 5 6
 */
public class BinaryTree {
    static class Node {
        Object data;
        Node left;
        Node right;

        public Node(Object data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    public static void main(String[] args) {
        BinaryTree simpleTree = createSimpleTree();
//        testInsert();

        inOrder(simpleTree.root);
        System.out.println();

        preOrder(simpleTree.root);
        System.out.println();
        
        postOrder(simpleTree.root);
        System.out.println();

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
     * 先序遍历
     *
     * @param root
     */
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static void testInsert() {
//        BinaryTree tree = new BinaryTree();
        Node node = new Node(1, null, null);
        insertLeft(node, 2);
        insertRight(node, 3);
        System.out.println(node.data);
        System.out.println(node.left.data);
        System.out.println(node.right.data);
    }

    public static Node insertLeft(Node root, Object data) {
        root.left = new Node(data, null, null);
        return root.left;
    }


    public static Node insertRight(Node root, Object data) {
        root.right = new Node(data, null, null);
        return root.right;
    }

    /**
     * 创建一棵树
     * .1
     * / \
     * 2 3
     * <p>
     * inorder
     * 2-1-3
     * preOrder
     * 1-2-3
     * postOrder
     * 2-3-1
     *
     * @return
     */
    private static BinaryTree createSimpleTree() {
        BinaryTree tree = new BinaryTree();
        Node one = new Node(1, null, null);
        Node two = new Node(2, null, null);
        Node three = new Node(3, null, null);

        one.left = two;
        one.right = three;

        tree.root = one;

        return tree;
    }


}
