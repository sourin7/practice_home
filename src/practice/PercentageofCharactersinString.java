package practice;

public class PercentageofCharactersinString {
    public static void getcharpercent(String str){
        int len=str.length();
        int uppercasecount=0;
        int lowercasecount=0;
        int digits=0;
        int specialchar=0;
        for(int i=0;i<len;i++){
            Character ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercasecount++;
            }
            else if(Character.isLowerCase(ch)){
                lowercasecount++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else{
                specialchar++;
            }
        }
         double uppercasepercentage=(uppercasecount*100)/len;
        double lowercasepercentage=(lowercasecount*100)/len;
        double digitpercentage=(digits*100)/len;
        double specialcharpercentage=(specialchar*100)/len;
        System.out.println("given string is "+str);
        System.out.println("uppercase percentage is "+uppercasepercentage);
        System.out.println("lowercase percentage is "+lowercasepercentage);
        System.out.println("digit percentage is "+digitpercentage);
        System.out.println("specialchar percentage is "+specialcharpercentage);

    }
    public static void main(String args[]){
        getcharpercent("souringot0fferfrom@GOOGLE!");
    }
}
