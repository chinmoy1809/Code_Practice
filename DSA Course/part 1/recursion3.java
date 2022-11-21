import java.util.*;

public class recursion3{
    public static int calculateFact(int n){
        if(n==1 ||n==0){
            return 1;
        }
        int fact_nm1 = calculateFact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The factorial is : ");
        System.out.println(calculateFact(n));
    }
}