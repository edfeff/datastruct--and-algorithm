package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 邻接表
 * 邻接列表将图表示为链接列表的数组。
 * 数组的索引表示一个顶点，其链接列表中的每个元素表示与该顶点形成边的其他顶点。
 * 我们在第一个示例中创建的图的邻接列表如下：
 *
 * @author wpp
 */
public class AdjacentList {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 邻接表
     * <p>
     * 图定义
     * graph:{
     * V:{0,1,2,3}
     * E:{(0,1),(0,2),(0,3),(1,2)}
     * G:{V,E}
     * }
     * <p>
     * 邻接表在存储方面非常有效，因为我们只需要存储边的值即可。
     * 对于具有数百万个顶点的图，这可能意味着节省了大量空间。
     */
    private static void test1() {
        class Node {
            Integer value;
            List<Node> links = new ArrayList<>();

            public void link(Node node) {
                links.add(node);
            }

            public Node(Integer value) {
                this.value = value;
            }
        }
        List<Node> v = new ArrayList<>();

        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n0.link(n1);
        n0.link(n2);
        n0.link(n3);

        n1.link(n0);
        n1.link(n2);

        n2.link(n0);
        n3.link(n0);


        v.add(n0);
        v.add(n1);
        v.add(n2);
        v.add(n3);

        for (int i = 0; i < v.size(); i++) {
            Node node = v.get(i);
            System.out.print(node.value + " : ");
            for (int j = 0; j < node.links.size(); j++) {
                if (j != 0) {
                    System.out.print(" -> ");
                }
                System.out.print(node.links.get(j).value);
            }
            System.out.println();
        }
    }


}
