package 希尔排序方法;
//希尔排序：高效插入排序一种，把数组下标的一定增量分组，对每组插入排序；随着增量逐渐减少，直至增量为1，整个数据分成一组，排序完成。
public class TestShellSort {
    public static void main(String[] args){
        int[] scores={90,65,50,87,55,74,63,76,100,92};
        shellSort(scores);
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static void shellSort(int[] array){
        //增量gap，逐渐缩小增量
        for (int gap=array.length/2;gap>0;gap=gap/2){
            //从第gap个元素，逐个对所在的数组进行排序
            for (int i=gap;i<array.length;i++){
                int j=i;
                while (j-gap>=0 && array[j]<array[j-gap]){
                    //交换数组元素
                    swap(array,j,j-gap);
                    j=j-gap;
                }
            }
        }
    }
    public static void swap(int[] array,int a,int b){
        //array[a]=array[a]+array[b];
        //array[b]=array[a]-array[b];
        //array[a]=array[a]-array[b];
        int temp=array[b];
        array[b]=array[a];
        array[a]=temp;
    }
}
