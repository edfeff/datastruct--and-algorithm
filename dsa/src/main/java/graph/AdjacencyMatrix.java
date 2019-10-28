package graph;

import java.util.*;

/**
 * 图的表示方法
 * 邻接矩阵
 *
 * @author wpp
 */
public class AdjacencyMatrix {

    public static void main(String[] args) {

        test1();
    }

    /**
     * 图定义
     * graph:{
     * V:{0,1,2,3}
     * E:{(0,1),(0,2),(0,3),(1,2)}
     * G:{V,E}
     * }
     * 邻接矩阵表示方法
     * <p>
     * 由于它是无向图，因此对于边（0,2），我们还需要标记边（2,0）；
     * 使邻接矩阵关于对角线对称。
     * <p>
     * 在邻接矩阵表示中，边查找（检查顶点A和顶点B之间是否存在边）非常快，
     * 但我们必须为所有顶点之间的每个可能链接保留空间（V x V），因此需要更多空间。
     */
    private static void test1() {
        class Edge {
            Integer p;
            Integer q;

            public Edge(Integer p, Integer q) {
                this.p = p;
                this.q = q;
            }
        }
        int[][] matrix = new int[4][4];
        List<Integer> v = Arrays.asList(0, 1, 2, 3);
        List<Edge> e = new ArrayList<>();
        e.add(new Edge(0, 1));
        e.add(new Edge(0, 2));
        e.add(new Edge(0, 3));
        e.add(new Edge(1, 2));

        for (int i = 0; i < e.size(); i++) {
            Edge edge = e.get(i);
            matrix[edge.p][edge.q] = 1;
            matrix[edge.q][edge.p] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
