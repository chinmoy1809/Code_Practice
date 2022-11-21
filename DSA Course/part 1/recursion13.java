// Q. Print All The Subsequences of a String.(IMPORTANT)
// Time & Complexity = O(2^n).
public class recursion13{
    public static void subsequences(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(index);
        //to be 
        subsequences(str,index+1,newString+currChar);
        //not to be 
        subsequences(str,index+1,newString);
    }
    public static void main(String[] args){
        String str = "abc";
        subsequences(str,0,"");
    }
}