package 线性表一维数组;
//在指定位置插入一个数
public class TestArrayInsert {
    public static void main(String[] args){
        int[] scores={1,2,3,4,5,6};
        scores=insert(scores,7,2);//将75插入到索引为2的位置
        //打印输出成绩
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static int[] insert(int[] array,int score,int index){
        int[] tempArray=new int[array.length+1];
        for (int i=0;i<array.length;i++){
            if (i<index){
                tempArray[i]=array[i];
            }
            else {
                tempArray[i+1]=array[i];
            }
        }
        tempArray[index]=score;
        return tempArray;
    }
}
