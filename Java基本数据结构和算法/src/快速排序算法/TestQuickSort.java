package 快速排序算法;
//把数组分为两个数组，然后递归调用自己，为子数组再排序知道完成.
public class TestQuickSort {
    public static void main(String[] args){
        int[] scores={99,65,50,87,100,63,76,101,92};
        quickSort(scores);
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    //递归调用的方法
    public static void quickSort(int[] array){
        if (array.length>0){
            quickSort(array,0,array.length-1);
        }
    }
    //真实的方法
    private static void quickSort(int[] array,int low,int high){
        if (low>high){
            return;
        }
        int i=low;
        int j=high;
        //基准值
        int threshold=array[low];
        //从表的两端交替向中间扫描
        while (i<j) {
            //从右往左找到第一个小于threshold的数的位置
            while (i < j && array[j] > threshold) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];//用比threshold小的数替换低位
            }
            //从左往右找到第一个大于threshold的数的位置
            while (i < j && array[i] < threshold) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];//用比threshold大的数替换高位
            }
        }
            array[i]=threshold;//将threshold替换回array[i]
            //对threshold左边的数快排
            quickSort(array,low,i-1);
            //对threshold右边的数快排
            quickSort(array,i+1,high);
    }
}