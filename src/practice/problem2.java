package practice;

public class problem2 {
public static boolean substring(String a, String b){
int n =a.length();
    for(int i=0;i<n;i++){

        if(a.contains(b)){
            return true;
        }

    }
    return false;
}

    public static void main(String[] args) {
        String a = "qwerty";
        String b = "rtyq";
        System.out.println(substring(a,b));
    }
}
