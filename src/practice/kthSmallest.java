package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static int kthSmallest(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i< arr.length;i++){
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq);
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={20,10,60,30,50,40};
        int k=3;
        System.out.println(kthSmallest(arr,k));
    }
}
