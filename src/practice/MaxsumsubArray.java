package practice;

public class MaxsumsubArray {
    public static int getmaxsumsubarray(int arr[]){
        int maxsum=0;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            else if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String args[]){
        int arr[]={-3,4,1,-7,3};
        System.out.print(getmaxsumsubarray(arr));
    }
}
