package 无向图和深度优先搜索;

public class TestGraphDep {
    public static void main(String[] args){
        Graph<String> graph=new Graph<String>(5);
        //添加顶点
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        //添加邻接边
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        //二维数组遍历输出顶点和邻接数组
        printGraph(graph);
        //深度优先搜索遍历输出
        System.out.print("\n广度优先搜索遍历输出:\n");
        graph.depthFirstSearch();
    }
    public static void printGraph(Graph<String> graph){
        System.out.print("二维数组遍历输出 顶点 边 和 邻接数组:\n");
        for (int i=0;i<graph.getVertexs().length;i++){
            System.out.print(graph.getVertexs()[i].getData()+" ");
        }
        System.out.print("\n");
        for (int i=0;i<graph.getAdjacencyMatrix().length;i++)
        {
            System.out.print(graph.getVertexs()[i].getData()+" ");
            for (int j=0;j<graph.getAdjacencyMatrix().length;j++)
            {
                System.out.print(graph.getAdjacencyMatrix()[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
