package 二分折半查找;
//折中查找，前加尾除于2//前提必须的有序排序要么递增要么递减
public class TestBinarySearch {
    public static void main(String[] args){
    //定义一个成绩数组
        int[] scores={30,40,50,70,85,90,100};
        int searchValue=40;
        int position=binarySearch(scores,searchValue);
        System.out.println(searchValue+"在数组的索引位置为:"+position);
    }
    public static int binarySearch(int[] arrays,int searchValue){
        //1.先初始化最低位 low=0，最高位high=scores.length-1
        int low=0;
        int high=arrays.length-1;
        int mid=0;
        while (low<=high){
            //2.求出中间数mid=（low+high）/2的值scores[mid]
            mid=(low+high)/2;
            //3.将中间位scores[mid]与Value比较
            //如果scores[mid]==value说明找到了当前索引mid，
            if (arrays[mid]==searchValue){
                return mid;
            }
            else if (arrays[mid]<searchValue){
                //如果小于成立，则说明要找的Value在mid+1和high之间
                low=mid+1;
            }
            else if (arrays[mid]>searchValue){
                //如果大于成立，则说明要找到的Values在low和mid-1之间
                high=mid-1;
            }
        }
        return -1;
    }
}