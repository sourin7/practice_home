package practice;

public class NthrowofPascalTriangle {

    public static void getnthrow(int n){
        int prev=1;
        System.out.print(prev);
        for(int i=1;i<=n;i++)
        {
            int curr=(prev*(n-i+1))/i;
            System.out.print(","+curr);
            prev=curr;
        }

    }
    public static void main(String args[]){
        int n=2;
        getnthrow(n);
    }
}
