package 插入排序算法;
//1,2位置先比，后面的一位再比，后大不动，后小前移。
public class TestInsertSort {
    public static void main(String[] args) {
        int[] scores = {90, 70, 50, 80, 60, 85};
        sort(scores);
        for (int score : scores) {
            System.out.print(score + ",");
        }
    }
    public static void sort(int[] arrays) {
        for (int i=0;i<arrays.length;i++){
            int insertElement=arrays[i];//取出未排序的新元素
            int insertPosition=i;//插入的位置
            for (int j=insertPosition-1;j>=0;j--){
                if (insertElement<arrays[j])
                {
                    //如果新元素小于已经排序的元素，已经排序的元素右移
                    arrays[j+1]=arrays[j];
                    insertPosition--;
                }
            }
            arrays[insertPosition]=insertElement;//插入新元素
        }
    }
}