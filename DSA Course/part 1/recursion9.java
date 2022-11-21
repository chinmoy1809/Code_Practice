//Q. Find the 1st and last occurance of an element in string.
public class recursion9{
    public static int first = -1;
    public static int last = -1;
    public static void printPossition(String str,int index,char element){
        if(index== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first ==-1){
                first =index;
            }else{
                last = index;
            }
        }
        printPossition(str,index+1,element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        printPossition(str,0,'a');
    }
}