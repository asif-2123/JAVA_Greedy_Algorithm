import java.util.*;
public class Coins_No {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,200,500};
        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> ans=new ArrayList<>();
        int coinNo=0;
        int amt=590;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amt){
                while(coins[i]<=amt){
                    coinNo++;
                    ans.add(coins[i]);
                    amt-=coins[i];
                }
            }
        }
        System.out.println(coinNo);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
