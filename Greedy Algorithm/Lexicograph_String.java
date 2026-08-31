import java.util.*;
public class Lexicograph_String{
    public static String getString(int N,int K){
        char[] result=new char[N];
        for(int i=0;i<N;i++){
            result[i]='a';
        }
        K-=N;

        int i=N-1;
        while(K>0 && i>=0){
            int add= Math.min(25,K);
            result[i]=(char)('a'+add);
            K-=add;
            i--;
        }
        return new String(result);
    }
    public static void main(String args[]){
        System.out.println(getString(5,42));
    }
}