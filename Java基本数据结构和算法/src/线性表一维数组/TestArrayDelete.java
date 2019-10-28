package 线性表一维数组;
//删除指定位置的学生成绩
public class TestArrayDelete {
    public static void main(String[] args){
        int[] scores={1,2,3,4,5,6};
        scores=delete(scores,3);
        //打印成绩
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static int[] delete(int[] array,int index){
        int[] tempArray=new int[array.length-1];
        for (int i=0;i<array.length;i++){
            if (i <=index) {
                tempArray[i]=array[i];
            }
            else {
                tempArray[i-1]=array[i];
            }
        }
        return tempArray;
    }
}
