package 无向图和广度优先搜索;

import java.util.LinkedList;
import java.util.Queue;
//定义图类 实现 顶点添加和广度优先搜索Graph，类似层次遍历（Queue）
public class Graph<T> {
    private int maxVerterSize;//二维数组大小
    private int size;//当前顶点大小
    private Vertex<T>[] vertexs;//顶点数组
    private int[][] adjacencyMatrix;//二位邻接数组
    private Queue<Integer> queue;//队列保存当前顶点

    public Graph(int maxVerterSize) {
        this.maxVerterSize = maxVerterSize;
        vertexs = new Vertex[maxVerterSize];
        adjacencyMatrix=new int[maxVerterSize][maxVerterSize];
        queue=new LinkedList<Integer>();
    }

    //添加顶点
    public void addVertex(T data) {
        Vertex vertex = new Vertex(data, false);
        vertexs[size] = vertex;
        size++;
    }

    //添加相邻边
    public void addEdge(int from, int to) {
        //A与B有边那么B与A也存在边
        adjacencyMatrix[from][to]=1;
        adjacencyMatrix[to][from]=1;
    }
    //广度优先搜索
    public void breadthFirstSearch(){
        //从第一个顶点开始搜索
        Vertex firstVertex=vertexs[0];
        firstVertex.setVisited(true);
        System.out.println(firstVertex.getData());
        queue.add(0);
        int col;
        while(!queue.isEmpty()){
            int head=queue.remove();
            col=findAdjacencyUnVisitedVertex(head);//获得相邻没有访问过的顶点位置
            while (col!=-1){
                //循环访问所有与当前顶点连接的顶点
                vertexs[col].setVisited(true);
                System.out.println(vertexs[col].getData());
                queue.add(col);
                col=findAdjacencyUnVisitedVertex(head);
            }
        }
        clear();
    }
    //获得相邻没有访问过的顶点位置
    public int findAdjacencyUnVisitedVertex(int row){
        for (int col=0;col<size;col++){
            if (adjacencyMatrix[row][col]==1&&!vertexs[col].isVisited()){
                return col;
            }
        }
        return -1;
    }
    //清除重置
    public void clear(){
        for (int i=0;i<size;i++){
            vertexs[i].setVisited(false);
        }
    }
    public int[][] getAdjacencyMatrix(){
        return adjacencyMatrix;
    }
    public Vertex<T>[] getVertexs(){
        return vertexs;
    }
}