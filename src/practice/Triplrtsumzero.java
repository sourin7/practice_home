package practice;

import java.util.Arrays;

public class Triplrtsumzero {
    public static void findtriplets(int arr[], int n){
        boolean found=false;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            while(l<r){
                if(x+arr[l]+arr[r]==0){
                    System.out.print(x+" ");
                    System.out.print(arr[l]+" ");
                    System.out.println(arr[r]+" ");
                    l++;
                    r--;
                    found=true;
                }
                else if (x+arr[l]+arr[r]<0){
                    l++;
                }
                else
                    r--;
            }
        }
        if(found==false){
            System.out.println("no triplets found");
        }
    }

    public static void main(String[] args) {
        int arr[]={0,-1,2,-3,1};
        int n= arr.length;

        findtriplets(arr,n);

    }
}
