package 二叉堆排序;

import java.util.HashMap;

public class TestHeapSort {
    public static void main(String[] args){
        HeapSort heapSort=new HeapSort();
        int[] scores={10,90,20,80,30,70,40,60,50};
        System.out.println("没有建堆前:");
            for (int i=0;i<scores.length;i++){
                System.out.print(scores[i]+",");
            }
            System.out.print("\n\n");
            ///////////////////////
        System.out.println("建堆之后:");
        heapSort.createHeap(scores);
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
        System.out.print("\n\n");
        ////////////////////////
        System.out.println("堆排序之后:");
        heapSort.heapSort();
        for (int i=0;i<scores.length;i++){
            System.out.print(scores[i]+",");
        }
    }
}
