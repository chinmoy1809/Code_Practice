/*  Q.print all Parmutations of a String.
    Time & Complexity = O(n!).
*/
public class recursion16 {
    public static void parmutation(String str,String parmutation){
        if(str.length()==0){
            System.out.println(parmutation);

        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            parmutation(newString, parmutation+currChar);
        }
    }
    public static void main(String[] args){
        String str = "abc"; 
        parmutation(str, "");
    }
}
