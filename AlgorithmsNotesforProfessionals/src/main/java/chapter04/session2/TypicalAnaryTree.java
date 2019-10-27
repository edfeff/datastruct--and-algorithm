package chapter04.session2;

/**
 * 树的遍历
 * TODO
 * 书的session 4.2 的树的遍历不对，无法遍历
 *
 * @author wangpp
 */
public class TypicalAnaryTree {
    static class Node {
        Node next;
        Node child;
        Object data;

        public Node(Node next, Node child, Object data) {
            this.next = next;
            this.child = child;
            this.data = data;
        }
    }

    void traversal(Node node, int depth) {
        while (node != null) {
            System.out.println(node.data);
            if (node.child != null) {
                traversal(node.child, depth + 1);
            }
            if (node.next != null) {
                traversal(node.next, depth);
            }
            node = node.next;
        }
    }

    void printTree(Node node, int depth) {
        while (node != null) {
            if (node.child != null) {
                //打印前导空格
                for (int j = 0; j < depth * 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("{\n");

                //DFS
                // 孩子
                printTree(node.child, depth + 1);

                for (int j = 0; j < depth * 3; j++) {
                    System.out.print(" ");
                }
                System.out.printf("%s\n", node.data);
            }
            //兄弟
            node = node.next;
        }
    }

    void printTree(Node node) {
        printTree(node, 0);
    }

    public static void main(String[] args) {
        TypicalAnaryTree tree = new TypicalAnaryTree();
        Node node10 = new Node(null, null, 10);
        Node node6 = new Node(node10, null, 6);
        Node node7 = new Node(null, node6, 7);
        Node node2 = new Node(node7, null, 2);
        Node node5 = new Node(null, node2, 5);
        tree.traversal(node5, 0);
    }
}
