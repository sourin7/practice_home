package practice;

public class RotateMatrix {
    public void rotate(int arr[][]){
int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                     {5,6,2},
                     {4,6,7}};
        RotateMatrix rm=new RotateMatrix();
        rm.rotate(arr);
    }
}
