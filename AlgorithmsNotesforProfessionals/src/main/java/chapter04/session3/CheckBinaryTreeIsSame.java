package chapter04.session3;

/**
 * 检查两个二叉树是否全等
 *
 * @author wangpp
 */
public class CheckBinaryTreeIsSame {
    public static void main(String[] args) {
        Node t1 = createTree();
        Node t2 = createTree();
        boolean b = sameTree(t1, t2);
        System.out.println(b);
    }

    private static Node createTree() {
        Node n4 = new Node(null, null, 4);
        Node n5 = new Node(null, null, 5);
        Node n6 = new Node(null, null, 6);
        Node n7 = new Node(null, null, 7);
        Node n3 = new Node(n6, n7, 3);
        Node n2 = new Node(n4, n5, 2);
        Node n1 = new Node(n2, n3, 1);
        return n1;
    }

    static boolean sameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        if (
                root1.data.equals(root2.data)
                        && sameTree(root1.left, root2.left)
                        && sameTree(root1.right, root2.right)
        ) {
            return true;
        }
        return false;
    }

    static class Node {
        Node left;
        Node right;
        Object data;

        public Node(Node left, Node right, Object data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
}
