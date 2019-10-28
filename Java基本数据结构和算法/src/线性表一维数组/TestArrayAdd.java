package 线性表一维数组;
//一维数组插入末尾插入一个数
public class TestArrayAdd {
    public static void main(String[] args){
        int[] scores={1,2,3,4,5,6};
        scores=add(scores,7);
        //打印成绩
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static int[] add(int[] array,int score){
        int[] tempArray=new int[array.length+1];
        for (int i=0;i<array.length;i++)
        {
            tempArray[i]=array[i];
        }
        tempArray[array.length]=score;
        return tempArray;
    }
}
