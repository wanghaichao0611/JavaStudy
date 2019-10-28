package 有向图拓扑排序;

import java.util.LinkedList;
import java.util.Queue;

//定义图类 实现 顶点添加和广度优先搜索Graph，类似层次遍历（Queue）
public class Graph<T> {
    private int maxVerterSize;//二维数组大小
    private int size;//当前顶点大小
    private Vertex<T>[] vertexs;//顶点数组
    private int[][] adjacencyMatrix;//二位邻接数组
    private Vertex<T>[] topologys;//拓扑排序结果数组，记录每个结点排序后的序号
    private Queue<Integer> queue;//队列保存当前顶点

    public Graph(int maxVerterSize) {
        this.maxVerterSize = maxVerterSize;
        vertexs = new Vertex[maxVerterSize];
        adjacencyMatrix=new int[maxVerterSize][maxVerterSize];
        queue=new LinkedList<Integer>();
        topologys=new Vertex[maxVerterSize];
    }

    //添加顶点
    public void addVertex(T data) {
        Vertex vertex = new Vertex(data, false);
        vertexs[size] = vertex;
        size++;
    }

    //添加相邻边
    public void addEdge(int from, int to) {
        //A->B不等于B->A
        adjacencyMatrix[from][to]=1;
    }

    public void topologySort(){
        while (size>0){
            int noSuccessorVertex=getNoSuccessorVertex();//获取一个无后继结点
            if (noSuccessorVertex==-1){
                System.out.print("图存在环");
                return;
            }
            topologys[size-1]=vertexs[noSuccessorVertex];//将待删除结点复制给排序数组
            removeVertex(noSuccessorVertex);//删除无后继点
        }
    }

   public int  getNoSuccessorVertex(){
        boolean existSuccessor=false;
        for (int row=0;row<size;row++){
            //对每一个结点
            existSuccessor=false;
            for (int col=0;col<size;col++){
                //如果结点的固定行，每一列有一个1，则说明结点有后继，终止循环
                if (adjacencyMatrix[row][col]==1){
                    existSuccessor=true;
                    break;
                }
            }
            if (!existSuccessor){
                //如果结点无后继，返回它的下标
                return row;

            }
        }return -1;
   }

   public void removeVertex(int vertex){
        if (vertex!=size-1){
            //如果顶点是最后一个元素结束
            for (int i=vertex;i<size-1;i++){
                //顶点从顶点数组删除
                vertexs[i]=vertexs[i+1];
            }
            for (int row=vertex;row<size-1;row++){
                //向上平行一行
                for (int col=0;col<size-1;col++){
                    adjacencyMatrix[row][col]=adjacencyMatrix[row+1][col];
                }
            }
            for (int col=vertex;col<size-1;col++){
                //向左平行一行
                for (int row=0;row<size-1;row++){
                    adjacencyMatrix[row][col]=adjacencyMatrix[row][col+1];
                }
            }
        }size--;//顶点数减1
   }

    public int[][] getAdjacencyMatrix(){
        return adjacencyMatrix;
    }
    public Vertex<T>[] getVertexs(){
        return vertexs;
    }
    public Vertex<T>[] getTopologys(){
        return topologys;
    }
    public int getSize(){
        return size;
    }
}