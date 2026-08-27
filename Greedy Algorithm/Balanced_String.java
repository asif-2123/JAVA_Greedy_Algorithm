import java.util.*;
public class Balanced_String {
    public static int maxPartition(String a,int n){
        int l=0,r=0,ans=0;
        if(n==0)
            return 0;
        for(int i=0;i<n;i++){
            if(a.charAt(i)=='L')
                l++;
            else
                r++;
            if(l==r)
                ans++;
        }return ans;
    }
    public static void main(String args[]){
        String str="LRRRRLLRLLRL";
        int n=str.length();
        System.out.println(maxPartition(str,n));
    }
}