public class recursion6{
    //Q.print x^n(stack height = log n).
    public static int calcPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2 ==0){//if n is even.
            return calcPower(x,n/2) * calcPower(x,n/2);
        }else{//if n is odd.
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }
    public static void main(String[] args){
        int x=2, n=6;
        int ans = calcPower(x,n);
        System.out.println("Your answer is : ");
        System.out.println(ans);
    }
}