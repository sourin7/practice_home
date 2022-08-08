package practice;

import java.util.ArrayList;
//addition of max and min element in array
public class myclass {
    public static int solve(ArrayList<Integer> a) {
        int min = a.get(0), max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        return max + min;
    }
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(-1);
        System.out.println(solve(a));
    }


}
