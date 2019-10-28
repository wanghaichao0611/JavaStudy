package 线性表一维数组;
//向一维数组任意位置(指定位置)修改一个数据,真实位置=要求位置-1;
public class TestArrayUpdate {
    public static void main(String[] args){
        int[] scores={1,2,3,4,5,6};
        scores=update(scores,7,2);
        //打印最后成绩
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
    public static int[] update(int[] arrary,int score,int index){
        arrary[index]=score;
        return arrary;

    }
}

