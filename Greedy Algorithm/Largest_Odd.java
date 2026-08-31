import java.util.*;
public class Largest_Odd {
    public static int kthLargest(int L,int R,int K){
        int largestOdd= (R%2==1) ? R : R-1;
        int kthLargest=largestOdd-2*(K-1);
        if(kthLargest<L)
            return 0;
        return kthLargest;
    }
    public static void main(String args[]){
       System.out.println(kthLargest(-3, 3, 1));
    }
}
