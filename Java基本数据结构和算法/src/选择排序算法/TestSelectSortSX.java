package 选择排序算法;
//每次选择最小值的同时也可以选出最大值，双向排序。减少排序趟数
public class TestSelectSortSX {
    public static void main(String[] args){
        int[] scores = {90,70,50,80,60,85};
        doubleSort(scores);
        for (int score:scores){
            System.out.print(score+",");
        }
    }
    public static void doubleSort(int[] arrays){
        int left=0;
        int right=arrays.length-1;
        int min=left;//存储最小值的下标
        int max=left;//存储最大值的下标
        while (left<=right){
            min=left;
            max=left;
            int compareCount=0;//每趟排序比较次数
            for(int i=left;i<=right;++i){
                if (arrays[i]<arrays[min]){
                    min=i;
                }
                if (arrays[i]>arrays[max]){
                        max=i;
                }
                compareCount++;
            }
            int temp=arrays[left];
            arrays[left]=arrays[min];
            arrays[min]=temp;

            if (left==max)
                max=min;

            temp=arrays[right];
                arrays[right]=arrays[max];
                arrays[max]=temp;
                ++left;
                --right;
                //输出每趟交换后的分数排列情况
            System.out.print("第"+left+"趟排序后结果:");
            for (int k=0;k<arrays.length;k++){
                System.out.print(arrays[k]+",");
            }
            System.out.println("比较次数:"+compareCount);
        }
    }
}
