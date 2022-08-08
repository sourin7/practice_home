package practice;

import java.util.ArrayList;

public class indexvaluematching {
    public static ArrayList<Integer> valueofindex(int arr[]){
        int n= arr.length;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int m=i%10;
            if(arr[i]==m+1){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[]={4,-1,3,7,5};
        System.out.println(valueofindex(arr));
    }
}
