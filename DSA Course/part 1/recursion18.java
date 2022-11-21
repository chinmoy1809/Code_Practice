/* Q.Place Tiles of size 1xm in a floor of size nxm.(print no. of weys)
 * 
 */
public class recursion18 {
    public static int placeTiles(int n,int m){
        if(n==m ){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vartically
        int vartPlacements = placeTiles(n-m, m);
        // Horizontally
        int horiPlacements = placeTiles(n-1,m);
        return vartPlacements + horiPlacements;
    } 
    public static void main(String args[]){
        int n =4,m=2;
        int no_of_ways = placeTiles(n,m);
        System.out.println("Total no. of ways : "+no_of_ways);
    }
    
}
