import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
       public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.print(getPermutation(n,k));
    }
    public static String getPermutation(int n,int k){
        k=k-1;
        int []numbers=new int[n];
        int[] indices=new int[n];
        for(int i=0;i<n;i++)
        numbers[i]=i+1;
        int divisor=1;
        for(int place=1;place<=n;place++){
            if((k/divisor)==0)
            break;
            indices[n-place]=(k/divisor) %place;
            divisor *= place;
        }
        for(int i=0;i<n;i++){
            int index=indices[i]+i;
            if(index != i){
                int temp=numbers[index];
                for(int j=index;j>i;j--)
                numbers[j]=numbers[j-1];
                numbers[i]=temp;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<numbers.length;j++){
            sb.append(numbers[j]);
        }
        return sb.toString();
    }
}
