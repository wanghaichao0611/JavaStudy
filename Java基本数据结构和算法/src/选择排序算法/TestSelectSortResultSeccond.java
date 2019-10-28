package 选择排序算法;
//一共排序几次，和比较的次数
public class TestSelectSortResultSeccond {
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
            int compareCount=0;//每趟排序比较次数
            for (int j=i;j<len;j++){
                //与每个元素比较如果小于最小值则交换并且保存交换值的索引为最小值索引
                if (minValue>arrays[j+1]){
                    minValue=arrays[j+1];
                    minIndex=j+1;
                }
                compareCount++;
            }
            //一次全部判断得出minIndex
            if (i!=minIndex){
                //判断如果最小值索引改变则把当前最小值与以排序的最后一个元素交换
                int temp=arrays[i];
                arrays[i]=arrays[minIndex];
                arrays[minIndex]=temp;
            }
            //每趟输入交换后的分数情况
            System.out.print("第"+(i+1)+"趟排序后结果:");
            for (int k=0;k<arrays.length;k++){
                System.out.print(arrays[k]+",");
            }
            System.out.println("比较次数:"+compareCount);
        }
    }
}
