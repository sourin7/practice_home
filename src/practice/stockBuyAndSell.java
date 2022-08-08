package practice;

public class stockBuyAndSell {
    public static int maxProfit(int arr[],int len){
        int maxProfit=0;
        int minsofar=arr[0];
        for(int i=0;i<len;i++){
            minsofar=Math.min(minsofar,arr[i]);
            int profit=arr[i]-minsofar;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4};
        int len=arr.length;
        System.out.println(maxProfit(arr,len));
    }
}
