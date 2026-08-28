import java.util.*;
public class Chocola_Problem {
    public static void main(String args[]){
        int m=6,n=4;
        Integer costHor[]={4,2,1};
        Integer costVer[]={2,1,3,1,4};
        Arrays.sort(costHor,Comparator.reverseOrder());
        Arrays.sort(costVer,Comparator.reverseOrder());
        int h=0,v=0,hp=1,vp=1,cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>=costVer[v]){
                cost+=costHor[h]*vp;
                h++;hp++;
            }else{
                cost+=costVer[v]*hp;
                v++;vp++;
            }
        }
        while(h<costHor.length){
            cost+=costHor[h]*vp;
            h++;
        }
        while(v<costVer.length){
            cost+=costVer[v]*hp;
            v++;
        }
        System.out.println(cost);
    }
}
