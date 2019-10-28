package 有向图拓扑排序;

//定义顶点类
public class Vertex<T>{
    private T data;//定点数据
    private boolean visited;//是否访问过
    private Vertex(){
        super();
    }
    public Vertex(T data,boolean visited){
        this.data=data;
        this.visited=visited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
