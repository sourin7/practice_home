package practice;

public class SubarraysumequalsK {
    public static int subarraysum(int arr[], int n, int sum){
        int curr_sum=arr[0];
        int start=0;
        for(int i=1;i<=n;i++){
            while(curr_sum>sum){
                curr_sum=curr_sum-arr[start];
                start++;
            }
            if(curr_sum==sum){
                int p=i-1;
                System.out.println("sum found between indexes are "+start+" and "+p);
                return 1;
            }
            if(i<n){
                curr_sum+=arr[i];
            }
        }
        System.out.println("no subarray found");
       return 0;
    }

    public static void main(String[] args) {
    int arr[]={1,2,3,7,5};
        int n= arr.length;
        int sum=12;
        subarraysum(arr,n,sum);
    }
}
