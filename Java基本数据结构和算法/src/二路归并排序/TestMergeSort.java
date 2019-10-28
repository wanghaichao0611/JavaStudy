package 二路归并排序;

//二路归并排序:将前半部分和后半部分的数据各自归并排序，将两个有序字表归并成一个有序表，以此递归

public class TestMergeSort {
    public static void main(String[] args){
        int[] scores={50,65,99,87,74,76,100,92};
        mergeSort(scores);
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static void mergeSort(int[] array){
        mergeSort(array,new int[array.length],0,array.length-1);
    }
    //递归调用排序
    public static void mergeSort(int[] array,int[] temp,int left,int right){
        if (left < right) {
            int center=(left+right)/2;
            mergeSort(array,temp,left,center);//左边
            mergeSort(array,temp,center+1,right);//右边
            merge(array,temp,left,center+1,right);//合并两个有序数组
        }
    }
    //将两个有序表归并成一个有序表
    public static void merge(int[] array,int[] temp,int left,int right,int rightEndIndex){
        int leftEndIndex=right-1;//左边结束下标
        int tempIndex=left;//从左边开始算
        int elementNumber=rightEndIndex-left+1;//元素个数
        while(left<=leftEndIndex && right<=rightEndIndex){
            if (array[left]<=array[right])
                temp[tempIndex++]=array[left++];
            else
                temp[tempIndex++]=array[right++];
        }
        while (left<=leftEndIndex){
            //左边如果有剩余
            temp[tempIndex++]=array[left++];
        }
        while (right<=rightEndIndex){
            //右边如果有剩余
            temp[tempIndex++]=array[right++];
        }
        //将temp复制到array
        for (int i=0;i<elementNumber;i++){
            array[rightEndIndex]=temp[rightEndIndex];
            rightEndIndex--;
        }
    }
}
