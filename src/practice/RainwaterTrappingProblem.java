package practice;

public class RainwaterTrappingProblem {
    public static int findwater(int arr[], int n){
        int result=0;
        int leftmax=0;
        int rightmax=0;
        int low=0;
        int high=n-1;
        while(low<=high){
            if(arr[low]<arr[high]){
                if(arr[low]>leftmax){
                    leftmax=arr[low];
                }
                else{
                    result+=leftmax-arr[low];
                }
                low++;
            }
            else{
                if(arr[high]>rightmax){
                    rightmax=arr[high];
                }
                else{
                    result+=rightmax-arr[high];
                }
                high--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        int n= arr.length;
        System.out.println("maximum water accumulated is: "+findwater(arr,n));
    }

}
