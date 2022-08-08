package practice;

public class Leaderelements {
    public static void getleaderelements(int arr[]){
        int max=arr[arr.length-1];
        System.out.print(max+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
    public static void main(String args[]){
        int arr[]={23,12,10,6,14,8};
        getleaderelements(arr);
    }
}
