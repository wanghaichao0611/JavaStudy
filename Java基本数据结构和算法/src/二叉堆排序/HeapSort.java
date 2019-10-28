package 二叉堆排序;

public class HeapSort {
    private int[] array;
    //初始化建堆
    public void createHeap(int[] array){
        this.array=array;
        //对数组建堆,(array.length-1)/2扫描一半有子节点的节点
        for (int i=(array.length-1)/2;i>=0;i--){
            adjustHeap(i,array.length-1);
        }
    }
    //调整堆
    public void adjustHeap(int currentIndex,int maxLength){
        int noLeafValue=array[currentIndex];//当前非叶子结点
        //2*currentIndex+1 当前左子树下标
        for (int j=2*currentIndex+1;j<=maxLength;j=currentIndex*2+1){
            if (j<maxLength && array[j]<array[j+1]){
                j++;//j较大的下标
            }
            if (noLeafValue>=array[j]){
                break;
            }
            array[currentIndex]=array[j];//上移到父节点
            currentIndex=j;
        }
        array[currentIndex]=noLeafValue;//要放入的位置
    }
    //堆排序
    public void heapSort(){
        for (int i=array.length-1;i>0;i--){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            adjustHeap(0,i-1);
        }
    }
}
