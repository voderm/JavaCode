package Voderm.dataStructure;

import java.util.*;

/**
 * @author: voderm Lee
 * @date: 2022/10/24 15:33
 */
public class Simple {
    public static void main(String[] args) {
        // 构建链表需要实例化多个类，并且指明实例中next的指向
        ListNode listnode1 = new ListNode(3);
        ListNode listnode2 = new ListNode(4);
        ListNode listnode3 = new ListNode(5);
        listnode1.next = listnode2;
        listnode2.next = listnode3;
        // 栈是一种先入后出的抽象数据结构
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        // 现在已经不用Stack类去实现栈结构，而是可以用ArrayDeque或者LinkedList
        LinkedList<Integer> aa = new LinkedList<>();
        aa.addLast(1);
        aa.addLast(2);
        aa.removeLast();
        aa.removeLast();

        // 队列
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.poll();
        queue.poll();

        // 实现树
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        // 图的表示方法通常有两种
        // 1.结合邻接矩阵
        // 图中的顶点可用数组存储，边就可以用邻接矩阵表示
        int[] vertices = {1, 2, 3, 4, 5};
        int[][] edges = {{0, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
                {1, 0, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {1, 0, 1, 1, 0}};
        // 2.邻接表： 使用数组 vertice 存储顶点，邻接表 edges 存储边。
        // edges 为一个二维容器，第一维 i 代表顶点索引，第二维 edges[i] 存储此顶点对应的边集和；
        // 例如 edges[0] = [1, 2, 3, 4] 代表 vertices[0] 的边集合为 [1, 2, 3, 4]。
        // 不同顶点 边的数量不一致 这就要用到 动态数组 ArrayList
        int[] vertices1 = {1,2,3,4,5};
        List<List<Integer>> edges1 = new ArrayList<>();

        List<Integer> edge_1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> edge_2 = new ArrayList<>(Arrays.asList(0,3));
        List<Integer> edge_3 = new ArrayList<>(Arrays.asList(0,4));
        List<Integer> edge_4 = new ArrayList<>(Arrays.asList(0,1,4));
        List<Integer> edge_5 = new ArrayList<>(Arrays.asList(0, 2, 3));
        edges1.add(edge_1);
        edges1.add(edge_2);
        edges1.add(edge_3);
        edges1.add(edge_4);
        edges1.add(edge_5);
        // 邻接矩阵 VS 邻接表 ：
        //
        // 邻接矩阵的大小只与节点数量有关，即 N^2
        // 其中 N 为节点数量。因此，当边数量明显少于节点数量时，使用邻接矩阵存储图会造成较大的内存浪费。
        // 因此，邻接表 适合存储稀疏图（顶点较多、边较少）； 邻接矩阵 适合存储稠密图（顶点较少、边较多）。

        // 散列表
        // 散列表是一种非线性数据结构，通过利用 Hash 函数将指定的「键 key」映射至对应的「值 value」，以实现高效的元素查找
        Map<String,Integer> dic = new HashMap<>();
        dic.put("voderm",1001);
        dic.put("sam",1002);
        dic.put("cindy",1003);

        dic.get("voderm");

        // 堆是一种基于完全二叉树的结构
        // 初始化小顶堆
        Queue<Integer> heap = new PriorityQueue<>();

        // 元素入堆
        heap.add(1);
        heap.add(4);
        heap.add(2);
        heap.add(6);
        heap.add(8);

        // 元素出堆（从小到大）
        heap.poll(); // -> 1
        heap.poll(); // -> 2
        heap.poll(); // -> 4
        heap.poll(); // -> 6
        heap.poll(); // -> 8

    }
}
// 链表类，
class ListNode{
    int value;
    ListNode next;
    ListNode(int x){
        this.value = x;
    }

}
// 树节点
class TreeNode{
    int value;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode(int x){
        value = x;
    }
}