package 冒泡排序算法;
//冒泡排序算法(擂台法)：n个元素，前后两个元素比较，比大还是小交换位置，直到排序完成.
public class TestBubbleSort {
    public static void main(String[] args){
        int[] scores={6,5,4,3,2,1};
        bubbleSort(scores);
        //打印最后成绩
        for (int i=0;i<scores.length;i++)
        {
            System.out.print(scores[i]+",");
        }
    }
    public static void bubbleSort(int[] array){
        //第一个循环排序趟数
        int[] tempArray=new int[array.length];
        for (int i=0;i<array.length-1;i++){
           //第二次循环控制每次要比较的元素次数
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int flag=array[j];
                    array[j]=array[j+1];
                    array[j+1]=flag;
                }
            }
        }
    }
}
