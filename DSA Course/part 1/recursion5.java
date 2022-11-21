public class recursion5 {
    public static int calculatePower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowernm1 = calculatePower(x,n-1);
        int xPowern = x * xPowernm1;
        return xPowern;
    }
    public static void main(String[] args){
        int x = 2;
        int n = 5;
        System.out.print("The answer is : ");
        System.out.println(calculatePower(x,n));
    }
    
}
