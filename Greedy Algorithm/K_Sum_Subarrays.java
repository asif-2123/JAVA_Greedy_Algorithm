import java.util.*;
public class K_Sum_Subarrays {
    public static int ans=Integer.MAX_VALUE;
    public static void solve(int a[],int n,int k,int index,int sum,int maxsum){      
        if(k==1){
            maxsum=Math.max(maxsum,sum);
            sum=0;
            for(int i=index;i<n;i++){
                sum+=a[i];
            }
            maxsum=Math.max(maxsum,sum);
            ans=Math.min(maxsum,ans);
            return;
        }
        sum=0;
        for(int i=index;i<n;i++){
            sum+=a[i];
            maxsum=Math.max(maxsum,sum);
            solve(a,n,k-1,i+1,sum,maxsum);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int k=3;
        int n=4;
        solve(arr,n,k,0,0,0);
        System.out.println(ans);
    }
}
