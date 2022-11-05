import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        String[] str=sc.readLine().split(" ");
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        long x=1;
        if(check(arr,n,x,n-2))
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
       
    }
    public static boolean check(long[] arr,int n,long x,int start){
        while(start>=0 && x>=1){
            if(arr[start]>=arr[start+1]){
                x=arr[start+1]-1;
                while(x>1 && arr[start]%x!=0){
                    x--;
                }
                if(x!=0)
                arr[start]=x;
            }
            start--;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
