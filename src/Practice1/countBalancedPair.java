package Practice1;

import java.util.Stack;

public class countBalancedPair {
    public static void main(String[] args) {
        int count=0;
        int totalbalanced=0;
        String str="{}{}";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch =='{') {
                count++;
            }
            else if(ch=='}'){
                if(count==0){

                }
                else count--;
                totalbalanced++;
            }
        }
        if(count==0){
            System.out.println("balanced");
        }
        else
            System.out.println("unbalanced");
        System.out.println(totalbalanced);

    }

}
