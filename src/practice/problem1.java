package practice;

public class problem1 {

    public static int[] largestfirst(int arr[], int n){

        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i+1;j<n;j++){
                if(arr[j]>temp){
                    temp=arr[j];

                }
            }
            arr[i]=temp;
        }
        arr[n-1]=-1;
       return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,10,7,1,9};
        int n= arr.length;

        int k[]=(largestfirst(arr,n));
        for(int l=0;l<n;l++){
            System.out.print(k[l]);
        }
    }
}
