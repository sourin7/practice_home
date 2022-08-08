package practice;

import java.util.ArrayList;
//rotate array A by B position
public class array_rotation {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B)%A.size()));
        }
        return ret;
    }

    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(-1);
        System.out.println(a);
        System.out.println(rotateArray(a,1));
    }
}

