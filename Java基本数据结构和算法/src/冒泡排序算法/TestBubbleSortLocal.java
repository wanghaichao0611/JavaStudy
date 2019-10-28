package 冒泡排序算法;
//如果发生了排序,记下每一趟最后一次的交换位置作为下一趟的比较次数
public class TestBubbleSortLocal {
    public static void main(String[] args) {
        //学生成绩
        int[] scores = {90,70,50,80,60,85};
        sort(scores);
    }
    public static void sort(int[] array){
        int len=array.length-1;
        int childLen=len;
        //第一趟循坏排序次数
        for (int i=0;i<len;i++){
            boolean isExchange=false;
            int count=0;
            int local=0;
            //控制比较元素的次数
            for (int j=0;j<childLen;j++){
                if (array[j]>array[j+1]){
                    int flag=array[j];
                    array[j]=array[j+1];
                    array[j+1]=flag;
                    isExchange=true;
                    local=j;
                }
                count++;//比较次数，若是放在IF中则是换位置的次数
            }
            if (!isExchange){
                break;
            }
            //保存上一次的最后交换位置
            childLen=local;
            //输出每趟循环交换后的分数情况
            System.out.print("第"+(i+1)+"趟排序后结果:");
            for (int k=0;k<array.length;k++){
                System.out.print(array[k]+",");
            }
            System.out.println("比较次数"+count);
        }
    }
}