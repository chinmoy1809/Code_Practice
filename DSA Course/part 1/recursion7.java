import java.util.*;

public class recursion7{
    // Q. Tower of Hanoi.
    public static void towerOfHanoi(int n,String scorse,String helper,String destination){
        if(n==1){
            System.out.println("Transfar disk "+n+" from "+scorse+" to "+destination);
            return;
        }
        towerOfHanoi(n-1,scorse,destination,helper);
        System.out.println("Transfar disk "+n+" from "+scorse+" to "+ destination);
        towerOfHanoi(n-1,helper,scorse,destination);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//3.
        towerOfHanoi(n,"scorse","helper","destination");
    }
}
// Time complexsity = O(2^n).