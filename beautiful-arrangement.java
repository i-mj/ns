import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int ans = arrangement(n);
        System.out.println(ans);
    }
    static int count = 0;
    public static int arrangement(int n){
        boolean [] visited = new boolean[n + 1];
        calculate(n,1,visited);
        return count;
    }
    public static void calculate(int n, int pos, boolean[] visited){
        if(pos > n){
            count++;
        }
        for(int i = 1; i <= n; i++){
            if(!visited[i] && (pos % i == 0 || i % pos == 0)){
                visited[i] = true;
                calculate(n,pos + 1,visited);
                visited[i] = false;
            }
        }
    }
}
