package 冒泡排序算法;
//判断时候发生排序，没有的话，立即停止。
public class TestBubbleSort2Y {
    public static void main(String[] args){
        int[] scores={6,5,4,3,2,1};
        //将分数从小到大排序
        sort(scores);
    }
    public static void sort(int[] array){
        //第一趟循环排序次数
        for (int i=0;i<array.length-1;i++){
            //每趟排序是否发生了交换
            boolean isExchange=false;
            //第二趟循坏控制每次要比较的元素次数
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int flag=array[j];
                    array[j]=array[j+1];
                    array[j+1]=flag;
                    isExchange=true;
                }
            }
            //如果没有发生排序，则排序完成
            if (!isExchange){
                break;
            }
            //输出每趟循环交换后的分数情况
            System.out.print("第"+(i+1)+"趟排序后结果:");
            for (int k=0;k<array.length;k++){
                System.out.print(array[k]+",");
            }
            System.out.println("");
        }
    }
}
