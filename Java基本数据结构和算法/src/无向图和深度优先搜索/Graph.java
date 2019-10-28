package 无向图和深度优先搜索;


import java.util.Stack;
//无向图和深度优先搜索，类似先根遍历
public class Graph<T> {
    private int maxVerterSize;//二维数组大小
    private int size;//当前顶点大小
    private  Vertex<T>[] vertexs;//顶点数组
    private int[][] adjacencyMatrix;//二位邻接数组
    private Stack<Integer> stack;//栈保存当前顶点

    public Graph(int maxVerterSize) {
        this.maxVerterSize = maxVerterSize;
        vertexs = new  Vertex[maxVerterSize];
        adjacencyMatrix=new int[maxVerterSize][maxVerterSize];
        stack=new Stack<Integer>();
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
    //深度优先搜索
    public void depthFirstSearch(){
        //从第一个顶点开始搜索
        Vertex firstVertex=vertexs[0];
        firstVertex.setVisited(true);
        System.out.println(firstVertex.getData());
        stack.push(0);
        int col;
        while(!stack.isEmpty()){
            int row=stack.peek();
            col=findAdjacencyUnVisitedVertex(row);//获得相邻没有访问过的顶点位置
            if (col==-1){
                stack.pop();
            }else {
                vertexs[col].setVisited(true);
                System.out.println(vertexs[col].getData());
                stack.push(col);
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
