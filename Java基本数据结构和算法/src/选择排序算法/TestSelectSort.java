package 选择排序算法;
//选择排序算法：将数组中剩下的没有排序的元素选出最小的一个，插入已经排序的后面
public class TestSelectSort {
    public static void main(String[] args){
        int[] scores = {90,70,50,80,60,85};
        sort(scores);
        for (int score:scores){
            System.out.print(score+",");
        }
    }
    public static void sort(int[] arrays){
        int len=arrays.length-1;
        int minIndex;//保存选择最小值的位置索引
        for (int i=0;i<len;i++){
            minIndex=i;
            int minValue=arrays[minIndex];//保存每次循环最小值为循环的第一个元素的值
            for (int j=i;j<len;j++){
                //与每个元素比较如果小于最小值则交换并且保存交换值的索引为最小值索引
                if (minValue>arrays[j+1]){
                    minValue=arrays[j+1];
                    minIndex=j+1;
                }
            }
            //一次全部判断得出minIndex
            if (i!=minIndex){
                //判断如果最小值索引改变则把当前最小值与以排序的最后一个元素交换
                int temp=arrays[i];
                arrays[i]=arrays[minIndex];
                arrays[minIndex]=temp;
            }
        }
    }
}
