package practice;

import java.util.HashSet;
import java.util.Set;

public class missingElementsInTwoArrays {
    public static void findMissing(int a[],int b[]){
        Set s=new HashSet<>();
        for(int element:a){
            s.add(element);
        }
        for(int element:b){
            if(s.contains(element)){
                s.remove(element);
            }
            else {
                s.add(element);
            }
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        int a[]={2,4,5,7,8,9};
        int b[]={2,5,8,10};
        findMissing(a,b);
    }
}
